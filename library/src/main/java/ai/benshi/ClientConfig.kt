package ai.benshi

/**
 * Represents all of the options a library user has to customize the behavior of the Promoted.Ai
 * SDK.
 */
data class ClientConfig(
    /**
     * Whether to collect metrics. When set to false, the library will operate in a stubbed fashion;
     * meaning, API calls are available to the library user, but nothing will happen.
     */
    val loggingEnabled: Boolean
) {
    enum class MetricsLoggingWireFormat {
        Json,
        Binary
    }

    data class Builder(
        /**
         * @see [ClientConfig.loggingEnabled]
         */
        var loggingEnabled: Boolean = true
    ) {
        /**
         * Create a [ClientConfig] object from the current state of this builder.
         */
        fun build() = ClientConfig(
            loggingEnabled
        )
    }
}
