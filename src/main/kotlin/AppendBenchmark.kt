package org.example

import kotlinx.benchmark.*
import org.openjdk.jmh.annotations.Fork
import org.openjdk.jmh.annotations.Level
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.random.Random

@State(Scope.Benchmark)
abstract class AppendBenchmark(val factory: () -> MutableList<Int>) {
    @Suppress("LeakingThis")
    private var mutableList: MutableList<Int> = factory()

    @Param(
        "10",
        "100",
        "1000",
        "10000",
        "100000",
        "1000000",
        "10000000",
        "100000000",
//        "1000000000"
    )
    var n: Int = 0

    private val random = Random

    private lateinit var dataSet: IntArray

    @Setup
    fun setup() {
        dataSet = IntArray(n) { random.nextInt(100000) }
    }

    @TearDown(Level.Iteration)
    fun teardown() {
        mutableList = factory()
    }

    @Benchmark
    fun appendBenchmark() {
        for (item in dataSet) mutableList.add(item)
    }
}

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.SingleShotTime)
@Fork(1)
@Warmup(iterations = 1)
@Measurement(iterations = 8, time = 1, timeUnit = TimeUnit.SECONDS)
class AppendLinkedListBenchmark : AppendBenchmark({ LinkedList() })

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.SingleShotTime)
@Fork(1)
@Warmup(iterations = 1)
@Measurement(iterations = 8, time = 1, timeUnit = TimeUnit.SECONDS)
class AppendArrayListBenchmark : AppendBenchmark({ ArrayList() })