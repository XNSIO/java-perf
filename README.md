# Java Performance

When you run the main method, you will notice that the [PrimitiveDataMapper](src/com/xnsio/perf/PrimitiveDataMapper.java) is performing the best. However from clean code point of view, it is the worst.

Why do we have to pay such a big price for trying to do the right thing is Java?

I don't understand why [StaticStreamDataMapper](src/com/xnsio/perf/StaticStreamDataMapper.java) is taking 10x more memory?