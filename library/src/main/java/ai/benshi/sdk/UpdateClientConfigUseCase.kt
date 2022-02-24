package ai.benshi.sdk

import ai.benshi.ClientConfig

/**
 * The purpose of this class is to take the latest cached [RemoteConfig] and merge it with the
 * compiled [ClientConfig] that the library user is passing in. The output will be a new
 * [ClientConfig] that prefers values from the [RemoteConfig] (since it's dynamic) over the original
 * baseline/compiled/hard-coded [ClientConfig] used to initialize the SDK.
 *
 * Any remotely configurable values on the original [ClientConfig] will be overridden by their
 * [RemoteConfig] counterparts if they are non-null in the latest [RemoteConfig].
 */
internal class UpdateClientConfigUseCase(
) {

}
