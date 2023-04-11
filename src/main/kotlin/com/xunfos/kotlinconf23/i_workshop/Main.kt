package com.xunfos.kotlinconf23.i_workshop

import com.xunfos.kotlinconf23.util.trace
import kotlinx.coroutines.delay

suspend fun main() {
    delay(100)
    trace("Hello world")
}
