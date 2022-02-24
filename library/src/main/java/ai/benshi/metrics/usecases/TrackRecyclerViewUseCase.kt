package ai.benshi.metrics.usecases

import ai.benshi.AbstractContent
import ai.benshi.ImpressionThreshold
import ai.benshi.ui.recyclerview.Tracker
import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.util.Log
import androidx.recyclerview.widget.RecyclerView


/**
 * Given a [RecyclerView], allows you to track impressions of [AbstractContent] based on which
 * rows are currently visible to the user. Will update impressions as the user scrolls.
 *
 * This class should be retained as a singleton to ensure the RecyclerView view keys are properly
 * tracked across their lifecycle.
 */
internal class TrackRecyclerViewUseCase(
    private val coreImpressionsUseCase: TrackCollectionsUseCase
) {
    private val currentRecyclerViews = mutableMapOf<String, Tracker<AbstractContent>>()

    fun trackRecyclerView(
        recyclerView: RecyclerView,
        currentDataProvider: () -> List<AbstractContent>,
        impressionThresholdBlock: (ImpressionThreshold.Builder.() -> Unit)?
    ) {
        val threshold = if (impressionThresholdBlock != null)
            ImpressionThreshold.Builder().apply(impressionThresholdBlock).build()
        else ImpressionThreshold.Builder().build()

        trackRecyclerView(recyclerView, currentDataProvider, threshold)
    }

    fun trackRecyclerView(
        recyclerView: RecyclerView,
        currentDataProvider: () -> List<AbstractContent>,
        impressionThreshold: ImpressionThreshold
    ) {
        val rvKey = "RV-${recyclerView.id}"

        // Cancel & remove any existing trackers for this RV
        stopAndRemoveTracking(rvKey)

        // Re-add a tracker (begins tracking automatically)
        currentRecyclerViews[rvKey] = Tracker(
            clock = System.currentTimeMillis(),
            recyclerView = recyclerView,
            visibilityThreshold = impressionThreshold,
            currentDataProvider = currentDataProvider,
            onVisibleRowsChanged = { onVisibleRowsChanged(recyclerView, rvKey, it) },
            onRecyclerViewDetached = { onRVDetached(recyclerView, rvKey) }
        )
    }

    private fun onVisibleRowsChanged(
        recyclerView: RecyclerView,
        rvKey: String,
        data: List<AbstractContent>
    ) {
        if(data.isNullOrEmpty()){
            Log.d("impressionData", "Empty1")
        }else{
            Log.d("impressionData", "Data1")
        }
        coreImpressionsUseCase.onCollectionUpdated(recyclerView.getActivity(), rvKey, data)
    }

    private fun onRVDetached(recyclerView: RecyclerView, rvKey: String) {
        stopAndRemoveTracking(rvKey)
        coreImpressionsUseCase.onCollectionHidden(recyclerView.getActivity(), rvKey)
    }

    private fun stopAndRemoveTracking(recyclerViewKey: String) =
        currentRecyclerViews.remove(recyclerViewKey)?.stopTracking()

    private fun RecyclerView.getActivity(): Activity? {
        var context: Context = context
        while (context is ContextWrapper) {
            if (context is Activity) {
                return context
            }
            context = (context as ContextWrapper).baseContext
        }
        return null
    }
}