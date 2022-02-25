package ai.benshi.sdk

import ai.benshi.AbstractContent
import ai.benshi.trackers.TrackCollectionsUseCase
import ai.benshi.trackers.TrackRecyclerViewUseCase
import ai.benshi.ui.ImpressionThreshold
import android.app.Activity
import androidx.recyclerview.widget.RecyclerView

/**
 * Default implementation of the [BshRecyclerInterface] interface, which delegates each call to its
 * appropriate underlying use case. Calls to [shutdown] are delegated directly to the [logger].
 */
@Suppress("TooManyFunctions", "LongParameterList")
internal class DefaultSdk(
    private val trackCollectionsUseCase: TrackCollectionsUseCase,
    private val trackRecyclerViewUseCase: TrackRecyclerViewUseCase,
) : BshRecyclerInterface {


    override fun onCollectionVisible(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
    ) = trackCollectionsUseCase.onCollectionVisible(sourceActivity, collectionViewKey, content)

    override fun onCollectionUpdated(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
    ) = trackCollectionsUseCase.onCollectionUpdated(sourceActivity, collectionViewKey, content)

    override fun onCollectionHidden(
        sourceActivity: Activity?,
        collectionViewKey: String,
    ) =
        trackCollectionsUseCase.onCollectionHidden(sourceActivity, collectionViewKey)

    override fun trackRecyclerView(
        recyclerView: RecyclerView,
        currentDataProvider: () -> List<AbstractContent>,
        impressionThresholdBlock: (ImpressionThreshold.Builder.() -> Unit)?
    ) = trackRecyclerViewUseCase.trackRecyclerView(
        recyclerView, currentDataProvider, impressionThresholdBlock
    )

    override fun trackRecyclerView(
        recyclerView: RecyclerView,
        currentDataProvider: () -> List<AbstractContent>,
        impressionThreshold: ImpressionThreshold
    ) = trackRecyclerViewUseCase.trackRecyclerView(
        recyclerView, currentDataProvider, impressionThreshold
    )

    override fun shutdown(){}
}
