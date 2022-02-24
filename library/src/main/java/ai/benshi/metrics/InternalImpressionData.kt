package ai.benshi.metrics

internal data class InternalImpressionData(
    val time: Long,
    val impressionId: String,
    val hasSuperimposedViews: Boolean?
)
