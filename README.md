# Benchmark for appending to the list

Java's `ArrayList` vs `LinkedList`.

## Results
Environment

````text
Macbook Air 
m3 8-core
java Corretto-17.0.14.7.1
````

```text
Benchmark                                      (n)  Mode  Cnt         Score         Error  Units
AppendArrayListBenchmark.appendBenchmark        10  avgt    8        56.328 ±       0.860  ns/op
AppendArrayListBenchmark.appendBenchmark       100  avgt    8       679.515 ±      21.530  ns/op
AppendArrayListBenchmark.appendBenchmark      1000  avgt    8      5923.530 ±     481.111  ns/op
AppendArrayListBenchmark.appendBenchmark     10000  avgt    8     42167.968 ±    2681.980  ns/op
AppendArrayListBenchmark.appendBenchmark    100000  avgt    8    331398.818 ±   16124.026  ns/op
AppendArrayListBenchmark.appendBenchmark   1000000  avgt    8  22744499.831 ± 3014147.051  ns/op

AppendLinkedListBenchmark.appendBenchmark       10  avgt    8        44.710 ±       0.862  ns/op
AppendLinkedListBenchmark.appendBenchmark      100  avgt    8       406.986 ±     138.218  ns/op
AppendLinkedListBenchmark.appendBenchmark     1000  avgt    8      3408.952 ±     124.704  ns/op
AppendLinkedListBenchmark.appendBenchmark    10000  avgt    8     37189.640 ±   10252.761  ns/op
AppendLinkedListBenchmark.appendBenchmark   100000  avgt    8    415327.868 ±   11975.716  ns/op
AppendLinkedListBenchmark.appendBenchmark  1000000  avgt    8   5140972.863 ±  843698.380  ns/op
```