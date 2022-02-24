package ai.benshi.di

import ai.benshi.ClientConfig
import ai.benshi.metrics.MetricsLogger
import ai.benshi.metrics.id.IdGenerator
import ai.benshi.metrics.id.UuidGenerator
import ai.benshi.metrics.usecases.TrackCollectionsUseCase
import ai.benshi.metrics.usecases.TrackRecyclerViewUseCase
import ai.benshi.platform.AndroidDeviceInfoProvider
import ai.benshi.platform.Clock
import ai.benshi.platform.DeviceInfoProvider
import ai.benshi.platform.KeyValueStorage
import ai.benshi.platform.LogcatLogger
import ai.benshi.platform.SharedPrefsKeyValueStorage
import ai.benshi.platform.SystemClock
import ai.benshi.platform.SystemLogger
import ai.benshi.runtime.ClassFinder
import ai.benshi.sdk.DefaultSdk
import ai.benshi.sdk.PromotedAiSdk
import android.content.Context
import android.content.SharedPreferences
import org.koin.core.module.Module
import org.koin.core.scope.Scope
import org.koin.dsl.module
import java.util.concurrent.TimeUnit

/**
 * The default [ConfigurableKoinComponent] used at runtime of the library. Knows how to provide
 * all library dependencies taking the [ClientConfig] into account.
 */
internal object DefaultKoinComponent : ConfigurableKoinComponent() {
    override fun buildModules(config: ClientConfig): List<Module> = listOf(
        module {
            single<SystemLogger> { LogcatLogger(tag = "Promoted.Ai", verbose = false) }
            single { config }
            single<PromotedAiSdk> {
                DefaultSdk(
                    get(),
                    get(),
                    get()
                )
            }
            single { createMetricsLoggerForConfig() }
            single { TrackCollectionsUseCase(get(), get()) }
            single { TrackRecyclerViewUseCase(get(), get()) }

            factory<IdGenerator> { UuidGenerator() }
            factory<KeyValueStorage> { SharedPrefsKeyValueStorage(get()) }
            factory { getPromotedAiPrefs(get()) }

            factory<Clock> { SystemClock() }
            factory<DeviceInfoProvider> { AndroidDeviceInfoProvider() }
            factory { ClassFinder() }
        }
    )

    private fun Scope.createMetricsLoggerForConfig(): MetricsLogger {
        val config: ClientConfig = get()
        val flushIntervalMillis =
            TimeUnit.SECONDS.toMillis(config.loggingFlushIntervalSeconds)
        return MetricsLogger(flushIntervalMillis)
    }

    private fun getPromotedAiPrefs(context: Context): SharedPreferences =
        context.getSharedPreferences("ai.promoted.prefs", Context.MODE_PRIVATE)
}
