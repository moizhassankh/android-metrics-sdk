package ai.benshi

import ai.benshi.sdk.SdkManager
import android.app.Application

/**
 * This class is primarily to provide an easy-to-use Java API, via [BshScroll.buildConfiguration],
 * so that users of the library can dynamically set whichever [ClientConfig] options they want to
 * set.
 *
 * While this is supported for Kotlin users, the [BshScroll.initialize]/[BshScroll.configure]
 * with the [ClientConfig.Builder] configuration block is recommended.
 */
class SdkBuilder internal constructor(
    private val sdkManager: SdkManager
) {

    private val clientConfigBuilder = ClientConfig.Builder()

    /**
     * @see [ClientConfig.loggingEnabled]
     */
    fun withLoggingEnabled(enabled: Boolean) =
        apply { clientConfigBuilder.loggingEnabled = enabled }

    /**
     * @see [BshScroll.initialize]
     */
    fun initialize(application: Application) = configure(application)

    /**
     * @see [BshScroll.configure]
     */
    @Suppress("MemberVisibilityCanBePrivate")
    fun configure(application: Application) =
        sdkManager.configure(application, clientConfigBuilder.build())
}
