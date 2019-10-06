# Java Performance

When you run the main method, you will notice that on a single instance the [NonLambdaStreamDataMapper](src/com/xnsio/perf/NonLambdaStreamDataMapper.java) and on new instance per loop the [StaticStreamDataMapper](src/com/xnsio/perf/StaticStreamDataMapper.java) is performing the best respectively. 

When we create new instance in the loop, I don't understand why [StreamDataMapper](src/com/xnsio/perf/StreamDataMapper.java) is taking 30x more memory?

Below is the stats from one of the runs

| Type              | Instance | Mem   | Time    |
|-------------------|----------|-------|-------- |
| [For Loop](src/com/xnsio/perf/ForDataMapper.java)          | Single   |  2 MB |   45 MS |
| [For Loop](src/com/xnsio/perf/ForDataMapper.java)          | Per Loop | 33 MB |  71 MS |
| [ForEach](src/com/xnsio/perf/ForEachDataMapper.java)           | Single   |  1 MB |   43 MS |
| [ForEach](src/com/xnsio/perf/ForEachDataMapper.java)           | Per Loop | 31 MB |  76 MS |
| [If-Else](src/com/xnsio/perf/PrimitiveDataMapper.java)           | Single   |  1 MB |  179 MS |
| [If-Else](src/com/xnsio/perf/PrimitiveDataMapper.java)           | Per Loop |  3 MB | 119 MS |
| [Stream](src/com/xnsio/perf/StreamDataMapper.java)            | Single   |  1 MB |   44 MS |
| [Stream](src/com/xnsio/perf/StreamDataMapper.java)            | Per Loop | 32 MB |  54 MS |
| [Static Stream](src/com/xnsio/perf/StaticStreamDataMapper.java)     | Single   |  1 MB |   38 MS |
| [Static Stream](src/com/xnsio/perf/StaticStreamDataMapper.java)     | Per Loop |  3 MB |  27 MS |
| [Non-Lambda Stream](src/com/xnsio/perf/NonLambdaStreamDataMapper.java) | Single   |  1 MB |   40 MS |
| [Non-Lambda Stream](src/com/xnsio/perf/NonLambdaStreamDataMapper.java) | Per Loop | 22 MB |  27 MS |
| [Parallel Stream](src/com/xnsio/perf/ParallelStreamDataMapper.java)   | Single   | 58 MB |  436 MS |
| [Parallel Stream](src/com/xnsio/perf/ParallelStreamDataMapper.java)   | Per Loop | 28 MB | 300 MS |
