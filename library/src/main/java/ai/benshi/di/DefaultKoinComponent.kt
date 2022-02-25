package ai.benshi.di

import ai.benshi.ClientConfig
import ai.benshi.trackers.TrackCollectionsUseCase
import ai.benshi.trackers.TrackRecyclerViewUseCase
import ai.benshi.sdk.DefaultSdk
import ai.benshi.sdk.BshRecyclerInterface
import android.content.Context
import android.content.SharedPreferences
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * The default [ConfigurableKoinComponent] used at runtime of the library. Knows how to provide
 * all library dependencies taking the [ClientConfig] into account.
 */
internal object DefaultKoinComponent : ConfigurableKoinComponent() {
    override fun buildModules(config: ClientConfig?): List<Module> = listOf(
        module {
            single { config }
            single<BshRecyclerInterface> {
                DefaultSdk(
                    get(),
                    get()
                )
            }
            single { TrackCollectionsUseCase() }
            single { TrackRecyclerViewUseCase(get()) }
            factory { getPromotedAiPrefs(get()) }
        }
    )

    private fun getPromotedAiPrefs(context: Context): SharedPreferences =
        context.getSharedPreferences("ai.promoted.prefs", Context.MODE_PRIVATE)
}
