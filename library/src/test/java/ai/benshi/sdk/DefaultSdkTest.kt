package ai.benshi.sdk

import ai.benshi.AbstractContent
import ai.benshi.ActionData
import ai.benshi.metrics.MetricsLogger
import ai.benshi.metrics.usecases.TrackCollectionsUseCase
import ai.benshi.metrics.usecases.TrackRecyclerViewUseCase
import ai.benshi.mockkRelaxedUnit
import ai.benshi.proto.event.ActionType
import io.mockk.verify
import org.junit.Test

class DefaultSdkTest {
    private val logger: MetricsLogger = mockkRelaxedUnit()
    private val impressionUseCase: TrackCollectionsUseCase = mockkRelaxedUnit()
    private val rvImpressionsUseCase: TrackRecyclerViewUseCase = mockkRelaxedUnit()

    private val sdk = DefaultSdk(
        logger,
        mockkRelaxedUnit(),
        mockkRelaxedUnit()
    )

    @Test
    fun startSession() {
        sdk.startSession("user-id")
        verify(exactly = 1) { sessionUseCase.startSession("user-id") }
    }

    @Test
    fun logView() {
        sdk.logView("view-id")
        verify(exactly = 1) { viewUseCase.logView("view-id") }
    }

    @Test
    fun onActionWithBuilder() {
        val dataBlock: ActionData.Builder.() -> Unit = {
            insertionId = "insertion-id"
        }
        sdk.onAction(null, "action-name", ActionType.CUSTOM_ACTION_TYPE, dataBlock)
        verify(exactly = 1) {
            actionUseCase.onAction(
                any(),
                "action-name",
                ActionType.CUSTOM_ACTION_TYPE,
                dataBlock
            )
        }
    }

    @Test
    fun onActionWithData() {
        val data = ActionData.Builder().apply {
            insertionId = "insertion-id"
        }.build(null)

        sdk.onAction("action-name", ActionType.CUSTOM_ACTION_TYPE, data)
        verify(exactly = 1) {
            actionUseCase.onAction(
                "action-name",
                ActionType.CUSTOM_ACTION_TYPE,
                data
            )
        }
    }

    @Test
    fun onCollectionVisible() {
        val collection = listOf(AbstractContent.Content("1"), AbstractContent.Content("2"))
        sdk.onCollectionVisible(null, "collection-key", collection, null)
        verify(exactly = 1) { impressionUseCase.onCollectionVisible(any(), "collection-key", collection, null) }
    }

    @Test
    fun onCollectionUpdated() {
        val collection = listOf(AbstractContent.Content("1"), AbstractContent.Content("2"))
        sdk.onCollectionUpdated(null, "collection-key", collection, null)
        verify(exactly = 1) { impressionUseCase.onCollectionUpdated(any(), "collection-key", collection, null) }
    }

    @Test
    fun onCollectionHidden() {
        sdk.onCollectionHidden(null, "collection-key", null)
        verify(exactly = 1) { impressionUseCase.onCollectionHidden(any(), "collection-key", null) }
    }

    @Test
    fun shutdown() {
        sdk.shutdown()
        verify(exactly = 1) { logger.cancelAndDiscardPendingQueue() }
    }
}