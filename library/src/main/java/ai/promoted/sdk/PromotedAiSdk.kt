package ai.promoted.sdk

import ai.promoted.AbstractContent
import ai.promoted.ActionData
import ai.promoted.ImpressionData
import ai.promoted.ImpressionThreshold
import ai.promoted.SessionInfo
import ai.promoted.proto.event.ActionType
import androidx.recyclerview.widget.RecyclerView

/**
 * The public-facing API for interacting with Promoted.Ai. Instances are managed internally by
 * the SDK.
 */
@Suppress("TooManyFunctions")
internal interface PromotedAiSdk {
    val currentSessionInfo: SessionInfo

    var logUserId: String
    var sessionId: String
    var viewId: String

    fun startSession(userId: String = "")
    fun onViewVisible(key: String)

    fun onImpression(dataBlock: ImpressionData.Builder.() -> Unit)
    fun onImpression(data: ImpressionData)

    fun onAction(
        name: String,
        type: ActionType,
        dataBlock: (ActionData.Builder.() -> Unit)? = null
    )

    fun onAction(
        name: String,
        type: ActionType,
        data: ActionData
    )

    fun onCollectionVisible(collectionViewKey: String, content: List<AbstractContent>)
    fun onCollectionUpdated(collectionViewKey: String, content: List<AbstractContent>)
    fun onCollectionHidden(collectionViewKey: String)

    fun trackRecyclerView(
        recyclerView: RecyclerView,
        currentDataProvider: () -> List<AbstractContent>,
        impressionThresholdBlock: (ImpressionThreshold.Builder.() -> Unit)? = null
    )

    fun trackRecyclerView(
        recyclerView: RecyclerView,
        currentDataProvider: () -> List<AbstractContent>,
        impressionThreshold: ImpressionThreshold
    )

    fun inspectCaughtThrowables(): List<Throwable>

    fun shutdown()
}
