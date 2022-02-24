package ai.benshi.sdk

import ai.benshi.AbstractContent
import ai.benshi.AutoViewState
import ai.benshi.ImpressionThreshold
import android.app.Activity
import androidx.recyclerview.widget.RecyclerView

/**
 * The public-facing API for interacting with Promoted.Ai. Instances are managed internally by
 * the SDK.
 */
@Suppress("TooManyFunctions")
internal interface PromotedAiSdk {

    fun onCollectionVisible(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
        autoViewState: AutoViewState?
    )

    fun onCollectionUpdated(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
        autoViewState: AutoViewState?
    )

    fun onCollectionHidden(
        sourceActivity: Activity?,
        collectionViewKey: String,
        autoViewState: AutoViewState?
    )

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

    fun shutdown()
}
