package ai.promoted.metrics.usecases

import ai.promoted.metrics.MetricsLogger
import ai.promoted.metrics.id.AdvanceableId
import ai.promoted.metrics.id.AncestorId
import ai.promoted.metrics.id.IdGenerator
import ai.promoted.platform.Clock
import ai.promoted.xray.Xray

/**
 * Allows you to track the start of an app session.
 *
 * This class makes use of [AdvanceableId], which means that you can query [sessionId] prior to
 * calling [startSession] in order to track events associated to the soon-to-be-started session, and
 * when you eventually do call [startSession], that original [sessionId] value will be
 * used/associated to the session that starts. All subsequent calls to [startSession] will result in
 * a new [sessionId] being generated.
 *
 * This class should be retained as a singleton in order to preserve the current [sessionId] across
 * other use cases.
 */
internal class TrackSessionUseCase(
    private val clock: Clock,
    private val logger: MetricsLogger,
    private val idGenerator: IdGenerator,
    private val currentUserIdsUseCase: CurrentUserIdsUseCase,
    private val xray: Xray
) {
    val sessionId = AncestorId(idGenerator)

    /**
     * If needed, generates a new session ID, then ensures that the logUserId is in sync with the
     * user ID, and then logs both a user message and a session message using [MetricsLogger].
     */
    fun startSession(userId: String) = xray.monitored {
        // Typically, we would generate a new session ID every time startSession is called;
        // however, there are cases where metrics need to be logged prior to a session starting.
        // For this case, we allow the initial value of sessionId to be retained on the first
        // startSession() call, so that metrics between the pre-session and session can be
        // properly associated
        sessionId.advance()

        syncCurrentUserId(userId)
        logUser()
        logSession()
    }

    private fun syncCurrentUserId(userId: String) {
        // if it's a new user ID (different value than what's in the store), store it in memory
        // & persist it.
        if (currentUserIdsUseCase.currentUserId != userId) {
            currentUserIdsUseCase.updateUserId(userId)

            // Now that a new user ID exists, a new logUserId needs to be generated & then stored
            currentUserIdsUseCase.updateLogUserId(idGenerator.newId())
        }
    }

    private fun logUser() = logger.enqueueMessage(createUserMessage(clock))
    private fun logSession() = logger.enqueueMessage(createSessionMessage(clock))
}
