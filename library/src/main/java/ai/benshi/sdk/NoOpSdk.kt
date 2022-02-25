package ai.benshi.sdk

import ai.benshi.AbstractContent
import ai.benshi.ui.ImpressionThreshold
import android.app.Activity
import androidx.recyclerview.widget.RecyclerView

/**
 * Non-operational implementation of the [BshRecyclerInterface] interface; used when
 * [ClientConfig.loggingEnabled] is set to false, or when the SDK has not yet been initialized.
 */
@Suppress("TooManyFunctions", "EmptyFunctionBlock")
internal class NoOpSdk : BshRecyclerInterface {


    override fun onCollectionVisible(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
    ) {
    }

    override fun onCollectionUpdated(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
    ) {
    }

    override fun onCollectionHidden(
        sourceActivity: Activity?,
        collectionViewKey: String,
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
