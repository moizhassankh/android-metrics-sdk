package ai.benshi.sdk

import ai.benshi.AbstractContent
import ai.benshi.AutoViewState
import ai.benshi.ImpressionThreshold
import ai.benshi.metrics.MetricsLogger
import ai.benshi.metrics.usecases.TrackCollectionsUseCase
import ai.benshi.metrics.usecases.TrackRecyclerViewUseCase
import android.app.Activity
import androidx.recyclerview.widget.RecyclerView

/**
 * Default implementation of the [PromotedAiSdk] interface, which delegates each call to its
 * appropriate underlying use case. Calls to [shutdown] are delegated directly to the [logger].
 */
@Suppress("TooManyFunctions", "LongParameterList")
internal class DefaultSdk(
    private val logger: MetricsLogger,
    private val trackCollectionsUseCase: TrackCollectionsUseCase,
    private val trackRecyclerViewUseCase: TrackRecyclerViewUseCase,
) : PromotedAiSdk {


    override fun onCollectionVisible(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
        autoViewState: AutoViewState?
    ) = trackCollectionsUseCase.onCollectionVisible(sourceActivity, collectionViewKey, content, autoViewState)

    override fun onCollectionUpdated(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
        autoViewState: AutoViewState?
    ) = trackCollectionsUseCase.onCollectionUpdated(sourceActivity, collectionViewKey, content, autoViewState)

    override fun onCollectionHidden(
        sourceActivity: Activity?,
        collectionViewKey: String,
        autoViewState: AutoViewState?
    ) =
        trackCollectionsUseCase.onCollectionHidden(sourceActivity, collectionViewKey, autoViewState)

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

    override fun shutdown() = logger.cancelAndDiscardPendingQueue()
}
