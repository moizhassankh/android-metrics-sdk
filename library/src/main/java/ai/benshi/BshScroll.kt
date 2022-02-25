package ai.benshi

import ai.benshi.sdk.PromotedAiSdk
import ai.benshi.sdk.SdkManager
import android.app.Activity
import android.app.Application
import androidx.recyclerview.widget.RecyclerView

/**
 * Single entry-point for the Promoted.Ai SDK. All SDK operations can be safely executed through
 * here without worrying about underlying dependencies / classes / object management.
 */
@Suppress("TooManyFunctions")
object BshScroll {
    private val manager = SdkManager()
    private val sdk get() = manager.sdkInstance


    /**
     * @see [PromotedAiSdk.autoViewId]
     */
    @JvmStatic
    @Deprecated("Auto-view ID will be used")
    var viewId: String = ""

    /**
     * @see [SdkManager.initialize]
     */
    @JvmStatic
    fun initialize(application: Application, block: ClientConfig.Builder.() -> Unit) =
        manager.initialize(application, block)

    /**
     * @see [SdkManager.initialize]
     */
    @JvmStatic
    fun initialize(application: Application, config: ClientConfig) =
        manager.initialize(application, config)

    /**
     * @see [SdkManager.configure]
     */
    @JvmStatic
    fun configure(application: Application, block: ClientConfig.Builder.() -> Unit) =
        manager.configure(application, block)

    /**
     * @see [SdkManager.configure]
     */
    @JvmStatic
    fun configure(application: Application, config: ClientConfig) =
        manager.configure(application, config)

    /**
     * @see [SdkManager.shutdown]
     */
    @JvmStatic
    fun shutdown() = manager.shutdown()

    /**
     * @see [PromotedAiSdk.onCollectionVisible]
     */
    @JvmStatic
    fun onCollectionVisible(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
    ) = sdk.onCollectionVisible(sourceActivity, collectionViewKey, content)

    /**
     * @see [PromotedAiSdk.onCollectionUpdated]
     */
    @JvmStatic
    fun onCollectionUpdated(
        sourceActivity: Activity?,
        collectionViewKey: String,
        content: List<AbstractContent>,
    ) = sdk.onCollectionUpdated(sourceActivity, collectionViewKey, content)

    /**
     * @see [PromotedAiSdk.onCollectionHidden]
     */
    @JvmStatic
    fun onCollectionHidden(
        sourceActivity: Activity?,
        collectionViewKey: String,
    ) = sdk.onCollectionHidden(sourceActivity, collectionViewKey)

    /**
     * @see [PromotedAiSdk.trackRecyclerView]
     */
    @JvmStatic
    fun trackRecyclerView(
        recyclerView: RecyclerView,
        currentDataProvider: () -> List<AbstractContent>,
        impressionThresholdBlock: (ImpressionThreshold.Builder.() -> Unit)? = null
    ) = sdk.trackRecyclerView(recyclerView, currentDataProvider, impressionThresholdBlock)

    /**
     * @see [PromotedAiSdk.trackRecyclerView]
     */
    @JvmStatic
    fun trackRecyclerView(
        recyclerView: RecyclerView,
        currentDataProvider: () -> List<AbstractContent>,
        impressionThreshold: ImpressionThreshold
    ) = sdk.trackRecyclerView(recyclerView, currentDataProvider, impressionThreshold)

    //region JAVA INTER-OP
    /* Java-idiomatic initialization of the SDK */
    /**
     * Begin building an SDK configuration in a chained fashion, finally resulting in an
     * initialize() or configure() call.
     *
     * Example usage from an [Application] class:
     *
     *     PromotedAi
     *         .buildConfiguration()
     *         .withMetricsLoggingUrl("https://myurl.com")
     *         .withMetricsLoggingApiKey("api-123")
     *         .initialize(this)
     *
     * @see [initialize]
     * @see [configure]
     */
    @JvmStatic
    fun buildConfiguration() = SdkBuilder(manager)

    /* Java-idiomatic way of tracking a RecyclerView */
    /**
     * Begin building a [RecyclerViewTrackingBuilder] configuration in a chained fashion,
     * finally resulting in a startTracking() call.
     *
     * Example usage:
     *
     *     PromotedAi
     *         .buildRecyclerViewTracking()
     *         .withTimeThreshold(1000L)
     *         .startTracking(recyclerView, recyclerViewContentProvider)
     */
    @JvmStatic
    fun buildRecyclerViewTracking() = RecyclerViewTrackingBuilder(sdk)
    //endregion
}
