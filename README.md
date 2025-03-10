# Benchmark for appending to the list

Java's `ArrayList` vs `LinkedList` vs `ArrayDeque` vs Kotlin's `ArrayDeque`

## Results
Environment

````text
Macbook Air 
m3 8-core
java Corretto-17.0.14.7.1
````

```text
Benchmark                                            (n)  Mode  Cnt         Score         Error  Units
AppendArrayListBenchmark.appendBenchmark              10  avgt    8        54.763 ±       0.655  ns/op
AppendArrayListBenchmark.appendBenchmark             100  avgt    8       627.301 ±      17.953  ns/op
AppendArrayListBenchmark.appendBenchmark            1000  avgt    8      3962.697 ±      13.927  ns/op
AppendArrayListBenchmark.appendBenchmark           10000  avgt    8     24963.081 ±      28.113  ns/op
AppendArrayListBenchmark.appendBenchmark          100000  avgt    8    222460.569 ±    1209.749  ns/op
AppendArrayListBenchmark.appendBenchmark         1000000  avgt    8  13982019.133 ± 3498014.117  ns/op

AppendJavaArrayDequeBenchmark.appendBenchmark         10  avgt    8        26.292 ±       0.213  ns/op
AppendJavaArrayDequeBenchmark.appendBenchmark        100  avgt    8       525.023 ±       1.618  ns/op
AppendJavaArrayDequeBenchmark.appendBenchmark       1000  avgt    8      4515.207 ±      61.718  ns/op
AppendJavaArrayDequeBenchmark.appendBenchmark      10000  avgt    8     36325.085 ±    1188.445  ns/op
AppendJavaArrayDequeBenchmark.appendBenchmark     100000  avgt    8    348401.663 ±   42516.798  ns/op
AppendJavaArrayDequeBenchmark.appendBenchmark    1000000  avgt    8  15655910.379 ± 2578169.262  ns/op

AppendKotlinArrayDequeBenchmark.appendBenchmark       10  avgt    8        40.153 ±       1.312  ns/op
AppendKotlinArrayDequeBenchmark.appendBenchmark      100  avgt    8       493.972 ±      12.922  ns/op
AppendKotlinArrayDequeBenchmark.appendBenchmark     1000  avgt    8      5238.673 ±      20.939  ns/op
AppendKotlinArrayDequeBenchmark.appendBenchmark    10000  avgt    8     53720.248 ±    1704.475  ns/op
AppendKotlinArrayDequeBenchmark.appendBenchmark   100000  avgt    8    326618.335 ±   22309.829  ns/op
AppendKotlinArrayDequeBenchmark.appendBenchmark  1000000  avgt    8  15498258.303 ±  645328.637  ns/op

AppendLinkedListBenchmark.appendBenchmark             10  avgt    8        31.699 ±       0.516  ns/op
AppendLinkedListBenchmark.appendBenchmark            100  avgt    8       278.359 ±       0.134  ns/op
AppendLinkedListBenchmark.appendBenchmark           1000  avgt    8      3024.292 ±     171.530  ns/op
AppendLinkedListBenchmark.appendBenchmark          10000  avgt    8     29639.101 ±     646.697  ns/op
AppendLinkedListBenchmark.appendBenchmark         100000  avgt    8    304839.935 ±    7757.808  ns/op
AppendLinkedListBenchmark.appendBenchmark        1000000  avgt    8   3091572.620 ±   40587.065  ns/op
```