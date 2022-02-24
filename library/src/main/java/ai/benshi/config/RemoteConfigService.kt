package ai.benshi.config

internal interface RemoteConfigService {
    val latestRemoteConfig: RemoteConfig
    fun fetchLatestConfigValues()
}
