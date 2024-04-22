# Benchmark for appending to the list

Java's `ArrayList` vs `LinkedList`.

```text
# JDK: 17.0.11, Amazon Corretto

Benchmark                                        (n)  Mode  Cnt            Score            Error  Units
AppendArrayListBenchmark.appendBenchmark          10    ss    8         5306.125 ±       6319.921  ns/op
AppendArrayListBenchmark.appendBenchmark         100    ss    8        24958.000 ±      32616.450  ns/op
AppendArrayListBenchmark.appendBenchmark        1000    ss    8       116380.000 ±      52868.429  ns/op
AppendArrayListBenchmark.appendBenchmark       10000    ss    8       604105.000 ±     306836.287  ns/op
AppendArrayListBenchmark.appendBenchmark      100000    ss    8      2023678.625 ±    2764903.537  ns/op
AppendArrayListBenchmark.appendBenchmark     1000000    ss    8     39245908.750 ±   52461790.698  ns/op
AppendArrayListBenchmark.appendBenchmark    10000000    ss    8    434244128.875 ±  198627533.476  ns/op
AppendArrayListBenchmark.appendBenchmark   100000000    ss    8   3271974074.375 ±  939977600.484  ns/op

AppendLinkedListBenchmark.appendBenchmark         10    ss    8         9645.875 ±       7075.200  ns/op
AppendLinkedListBenchmark.appendBenchmark        100    ss    8        27685.625 ±      45712.094  ns/op
AppendLinkedListBenchmark.appendBenchmark       1000    ss    8       121030.125 ±      48008.181  ns/op
AppendLinkedListBenchmark.appendBenchmark      10000    ss    8       752575.000 ±     516759.426  ns/op
AppendLinkedListBenchmark.appendBenchmark     100000    ss    8      2673652.250 ±    3693285.328  ns/op
AppendLinkedListBenchmark.appendBenchmark    1000000    ss    8     82214135.375 ±  137631001.278  ns/op
AppendLinkedListBenchmark.appendBenchmark   10000000    ss    8   1138622404.625 ±  977136817.975  ns/op
AppendLinkedListBenchmark.appendBenchmark  100000000    ss    8  19081331759.875 ± 2817037141.306  ns/op
```