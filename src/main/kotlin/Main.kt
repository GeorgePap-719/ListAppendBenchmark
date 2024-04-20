package org.example

import kotlinx.benchmark.*
import org.openjdk.jmh.annotations.Fork
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.random.Random

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@Fork(1)
//@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Warmup(iterations = 1)
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
class AppendBenchmark {
    private var linkedList = LinkedList<Int>()
    private var arrayList = ArrayList<Int>()

    @Param(
        "10",
        "100",
        "1000",
        "10000",
        "100000",
        "1000000",
        "10000000", /*"100000000", "1000000000" */
    )
    var n: Int = 0
    private val random = Random

    private lateinit var dataSet: IntArray

    @Setup
    fun setup() {
        dataSet = IntArray(n) { random.nextInt(100000) }
    }

    @TearDown
    fun cleanup() {
        linkedList = LinkedList<Int>()
        arrayList = ArrayList<Int>()
    }

    @Benchmark
    fun appendLinkedListBenchmark() {
        for (item in dataSet) linkedList.add(item)
    }

    @Benchmark
    fun appendArrayListBenchmark() {
        for (item in dataSet) arrayList.add(item)
    }
}

