package com.xunfos.kotlinconf23.util

import kotlinx.coroutines.delay
import kotlin.system.measureTimeMillis

inline fun withExecutionTime(block: () -> Unit) = measureTimeMillis {
    block()
}.run { println("Total Execution time: ${this}ms") }

fun trace(msg: Any) = println("[${getThreadName()}] $msg")

fun getThreadName(): String = Thread.currentThread().name

suspend fun <T> withDelay(timeoutMillis: Long = 100L, block: () -> T): T {
    delay(timeoutMillis)
    return block()
}
