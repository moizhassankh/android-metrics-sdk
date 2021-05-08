package ai.promoted.metrics.usecases

import ai.promoted.metrics.MetricsLogger
import ai.promoted.metrics.id.IdGenerator
import ai.promoted.proto.common.Timing
import ai.promoted.proto.event.Action
import ai.promoted.proto.event.ActionType
import com.google.protobuf.Message
import io.mockk.CapturingSlot
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.notNullValue
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class TrackActionUseCaseTest {
    private val randomUuid = "random-uuid"
    private val logUserId = "log-user-id"
    private val testSessionId = "session-id"
    private val testViewId = "view-id"

    private val enqueuedMessage = CapturingSlot<Message>()
    private val basedOnUuid = CapturingSlot<String>()
    private val logger = mockk<MetricsLogger> {
        every { enqueueMessage(capture(enqueuedMessage)) } returns Unit
    }
    private val idGenerator = mockk<IdGenerator> {
        every { newId() } returns randomUuid
        every { newId(basedOn = capture(basedOnUuid)) } answers {
            firstArg()
        }
    }
    private val currentUserIdsUseCase = mockk<CurrentUserIdsUseCase> {
        every { currentLogUserId } returns logUserId
    }
    private val useCase = TrackActionUseCase(
        clock = mockk { every { currentTimeMillis } returns 0L },
        logger = logger,
        idGenerator = idGenerator,
        impressionIdGenerator = ImpressionIdGenerator(idGenerator, currentUserIdsUseCase),
        sessionUseCase = mockk {
            every { sessionId } returns testSessionId
        },
        viewUseCase = mockk {
            every { viewId } returns testViewId
        }
    )

    @Test
    fun `Simple action is logged when no data block`() {
        // When
        useCase.onAction("test", ActionType.ADD_TO_CART, dataBlock = null)

        // Then
        val action = enqueuedMessage.captured as? Action
        verify(exactly = 1) { logger.enqueueMessage(any()) }
        assertThat(action, notNullValue())
    }

    @Test
    fun `Impression ID is based on insertion ID when it is available`() {
        // When
        useCase.onAction("test", ActionType.CUSTOM_ACTION_TYPE) {
            insertionId = "test-insertion-id"
            contentId = "test-content-id"
            requestId = "test-request-id"
            elementId = "test-element-id"
            targetUrl = null

            // Fake custom properties
            customProperties = Timing.newBuilder().setClientLogTimestamp(0L).build()
        }

        // Then
        val action = enqueuedMessage.captured as? Action
        verify(exactly = 1) { logger.enqueueMessage(any()) }
        assertThat(action, notNullValue())
        assertThat(action?.impressionId, equalTo("test-insertion-id"))
    }

    @Test
    fun `Impression ID is based on combination of content ID and logUserId when content ID is available`() {
        // When
        useCase.onAction("test", ActionType.CUSTOM_ACTION_TYPE) {
            insertionId = null
            contentId = "test-content-id"
            requestId = "test-request-id"
            elementId = "test-element-id"
            targetUrl = null

            // Fake custom properties
            customProperties = Timing.newBuilder().setClientLogTimestamp(0L).build()
        }

        // Then
        val action = enqueuedMessage.captured as? Action
        verify(exactly = 1) { logger.enqueueMessage(any()) }
        assertThat(action, notNullValue())
        assertThat(action?.impressionId, equalTo("test-content-id$logUserId"))
    }

    @Test
    fun `Impression ID is null or empty if both insertion ID and content ID are null`() {
        // When
        useCase.onAction("test", ActionType.CUSTOM_ACTION_TYPE) {
            insertionId = null
            contentId = null
            requestId = "test-request-id"
            elementId = "test-element-id"
            targetUrl = null

            // Fake custom properties
            customProperties = Timing.newBuilder().setClientLogTimestamp(0L).build()
        }

        // Then
        val action = enqueuedMessage.captured as? Action
        verify(exactly = 1) { logger.enqueueMessage(any()) }
        assertThat(action, notNullValue())
        assertThat(action?.impressionId ?: "", equalTo(""))
    }

    @Test
    fun `Correct session ID and view ID are used in message`() {
        // When
        useCase.onAction("test", ActionType.CUSTOM_ACTION_TYPE) {
            insertionId = null
            contentId = null
            requestId = "test-request-id"
            elementId = "test-element-id"
            targetUrl = null

            // Fake custom properties
            customProperties = Timing.newBuilder().setClientLogTimestamp(0L).build()
        }

        // Then
        val action = enqueuedMessage.captured as? Action
        verify(exactly = 1) { logger.enqueueMessage(any()) }
        assertThat(action, notNullValue())
        assertThat(action?.sessionId, equalTo(testSessionId))
        assertThat(action?.viewId, equalTo(testViewId))
    }
}