package ai.benshi

import io.mockk.mockk

inline fun <reified T : Any> mockkRelaxedUnit(block: T.() -> Unit = {}) =
    mockk<T>(relaxUnitFun = true, block = block)