package org.example

import kotlinx.benchmark.*
import org.openjdk.jmh.annotations.Fork
import org.openjdk.jmh.annotations.Level
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayDeque
import kotlin.random.Random

@State(Scope.Benchmark)
abstract class AppendBenchmark(private val factory: () -> MutableList<Int>) {
    private var mutableList: MutableList<Int> = factory()

    @Param(
        "10",
        "100",
        "1000",
        "10000",
        "100000",
        "1000000",
//        "10000000",
//        "100000000",
//        "1000000000"
    )
    var n: Int = 0

    private val random = Random

    private lateinit var dataSet: IntArray

    @Setup
    fun setup() {
        dataSet = IntArray(n) { random.nextInt(100_000) }
    }

    @Benchmark
    fun appendBenchmark(): List<Int> {
        mutableList = factory()
        for (item in dataSet) mutableList.add(item)
        return mutableList
    }
}

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@Warmup(iterations = 3)
@Measurement(iterations = 8, time = 1, timeUnit = TimeUnit.SECONDS)
class AppendLinkedListBenchmark : AppendBenchmark({ LinkedList() })

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@Warmup(iterations = 3)
@Measurement(iterations = 8, time = 1, timeUnit = TimeUnit.SECONDS)
class AppendArrayListBenchmark : AppendBenchmark({ ArrayList() })

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@Warmup(iterations = 3)
@Measurement(iterations = 8, time = 1, timeUnit = TimeUnit.SECONDS)
class AppendArrayDequeBenchmark : AppendBenchmark({ ArrayDeque() })