# Java Performance

When you run the main method, you will notice that [StaticStreamDataMapper](src/com/xnsio/perf/StaticStreamDataMapper.java) is performing the best from time perspective. [StreamDataMapper](src/com/xnsio/perf/StreamDataMapper.java) is performing the best from memory perspective.

I'm not sure why [Loop with if-else](src/com/xnsio/perf/PrimitiveDataMapper.java) is performing so badly. Why is the compiler not optimising it?

Important: Notice, how [NonLambdaStreamDataMapper](src/com/xnsio/perf/NonLambdaStreamDataMapper.java) is performing slightly better than [Stream with Lambdas](src/com/xnsio/perf/StreamDataMapper.java)

As expected, [ParallelStreamDataMapper](src/com/xnsio/perf/ParallelStreamDataMapper.java) is performing the worst. The overheads of spanning a thread is not worth when we are performing a trivial operation inside the parallel stream.

Below is the stats from one of the runs

| Type              | Instance | Mem   | Time    |
|-------------------|----------|-------|-------- |
| [For Loop](src/com/xnsio/perf/ForDataMapper.java)          | Single   |  >1 MB |   54 MS |
| [For Loop](src/com/xnsio/perf/ForDataMapper.java)          | Per Loop | 1 MB |  49 MS |
| [ForEach](src/com/xnsio/perf/ForEachDataMapper.java)           | Single   |  >1 MB |   46 MS |
| [ForEach](src/com/xnsio/perf/ForEachDataMapper.java)           | Per Loop |>1 MB |  40 MS |
| [If-Else Inside For Loop](src/com/xnsio/perf/PrimitiveDataMapper.java)           | Single   |  >1 MB |  154 MS |
| [If-Else Inside For Loop](src/com/xnsio/perf/PrimitiveDataMapper.java)           | Per Loop |  3 MB | 109 MS |
| [Stream](src/com/xnsio/perf/StreamDataMapper.java)            | Single   |  >1 MB |   47 MS |
| [Stream](src/com/xnsio/perf/StreamDataMapper.java)            | Per Loop | >1 MB |  44 MS |
| [Static Stream](src/com/xnsio/perf/StaticStreamDataMapper.java)     | Single   |  >1 MB |   32 MS |
| [Static Stream](src/com/xnsio/perf/StaticStreamDataMapper.java)     | Per Loop |  3 MB |  22 MS |
| [Non-Lambda Stream](src/com/xnsio/perf/NonLambdaStreamDataMapper.java) | Single   |  >1 MB |   49 MS |
| [Non-Lambda Stream](src/com/xnsio/perf/NonLambdaStreamDataMapper.java) | Per Loop | 2 MB |  25 MS |
| [Parallel Stream](src/com/xnsio/perf/ParallelStreamDataMapper.java)   | Single   | 13 MB |  773 MS |
| [Parallel Stream](src/com/xnsio/perf/ParallelStreamDataMapper.java)   | Per Loop | 3 MB | 571 MS |
