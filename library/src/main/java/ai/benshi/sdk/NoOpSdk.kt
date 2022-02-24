package ai.benshi.sdk

import ai.benshi.AbstractContent
import ai.benshi.AutoViewState
import ai.benshi.ImpressionThreshold
import android.app.Activity
import androidx.recyclerview.widget.RecyclerView

/**
 * Non-operational implementation of the [PromotedAiSdk] interface; used when
 * [ClientConfig.loggingEnabled] is set to false, or when the SDK has not yet been initialized.
 */
@Suppress("TooManyFunctions", "EmptyFunctionBlock")
internal class NoOpSdk : PromotedAiSdk {


    override fun onCollectionVisible(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
        autoViewState: AutoViewState?
    ) {
    }

    override fun onCollectionUpdated(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
        autoViewState: AutoViewState?
    ) {
    }

    override fun onCollectionHidden(
        sourceActivity: Activity?,
        collectionViewKey: String,
        autoViewState: AutoViewState?
    ) {
    }

    override fun trackRecyclerView(
        recyclerView: RecyclerView,
        currentDataProvider: () -> List<AbstractContent>,
        impressionThresholdBlock: (ImpressionThreshold.Builder.() -> Unit)?
    ) {
    }

    override fun trackRecyclerView(
        recyclerView: RecyclerView,
        currentDataProvider: () -> List<AbstractContent>,
        impressionThreshold: ImpressionThreshold
    ) {
    }

    override fun shutdown() {}
}
