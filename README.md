# Java Performance

When you run the main method, you will notice that on a single instance the [NonLambdaStreamDataMapper](src/com/xnsio/perf/NonLambdaStreamDataMapper.java) and on new instance per loop the [StaticStreamDataMapper](src/com/xnsio/perf/StaticStreamDataMapper.java) is performing the best respectively. 

When we create new instance in the loop, I don't understand why [StreamDataMapper](src/com/xnsio/perf/StreamDataMapper.java) is taking 30x more memory?

Below is the stats from one of the runs

| Type              | Instance | Mem   | Time    |
|-------------------|----------|-------|-------- |
| For Loop          | Single   |  2 MB |   87 MS |
| For Loop          | Per Loop | 33 MB |  222 MS |
| ForEach           | Single   |  2 MB |   79 MS |
| ForEach           | Per Loop | 38 MB |  194 MS |
| If-Else           | Single   |  1 MB |  392 MS |
| If-Else           | Per Loop |  3 MB | 1025 MS |
| Stream            | Single   |  1 MB |   87 MS |
| Stream            | Per Loop | 33 MB |  215 MS |
| Static Stream     | Single   |  1 MB |   81 MS |
| Static Stream     | Per Loop |  4 MB |  181 MS |
| Non-Lambda Stream | Single   |  1 MB |   69 MS |
| Non-Lambda Stream | Per Loop | 24 MB |  152 MS |
| Parallel Stream   | Single   | 44 MB |  479 MS |
| Parallel Stream   | Per Loop | 43 MB | 1115 MS |
