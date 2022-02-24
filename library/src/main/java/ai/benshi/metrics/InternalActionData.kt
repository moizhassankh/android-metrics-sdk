package ai.benshi.metrics

import ai.benshi.proto.event.ActionType

/**
 * Represents all data associated to an action that is generated internally in the library.
 */
internal data class InternalActionData(
    val name: String,
    val type: ActionType,
    val actionId: String,
    val sessionId: String?,
    val autoViewId: String?,
    val hasSuperimposedViews: Boolean?
)
