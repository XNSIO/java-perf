package com.xnsio.perf;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static java.lang.Runtime.getRuntime;
import static java.lang.System.nanoTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Pair<String, String>> input = buildInput();
        int loopCount = args.length == 1 ? Integer.parseInt(args[0]) : 20000;
        execute(input, loopCount, "---For---", ForDataMapper::executeFor);
        execute(input, loopCount, "---ForEach---", ForEachDataMapper::executeForEach);
        execute(input, loopCount, "---Primitive---", PrimitiveDataMapper::executePrimitive);
        execute(input, loopCount, "---Stream---", StreamDataMapper::executeStream);
        execute(input, loopCount, "---Static Stream---", StaticStreamDataMapper::executeStream);
        execute(input, loopCount, "---Parallel Streams---", ParallelStreamDataMapper::executeParallelStream);
        execute(input, loopCount, "---Non Lambda Streams---", NonLambdaStreamDataMapper::executeStream);
    }

    private static void execute(final List<Pair<String, String>> input, int loopCount, String name, Function<List<Pair<String, String>>, Boolean> function)
            throws InterruptedException {
        Runtime runtime = getRuntime();
        System.gc();
        Thread.sleep(5000);
        long startTime = nanoTime();
        long initialMemoryUsed = memUsed(runtime);
        for (int i = 0; i < loopCount; ++i)
            function.apply(input);
        // IntStream.range(0, loopCount).forEach(i->function.apply(input));
        long timeElapsed = nanoTime() - startTime;
        long afterMemoryUsed = memUsed(runtime);
        System.out.println(name + " Mem consumed (B:" + initialMemoryUsed + ") & (A:" + afterMemoryUsed + "): "
                + (afterMemoryUsed - initialMemoryUsed) / (1024 * 1024) + " MB");
        System.out.println(name + " Execution time: " + (timeElapsed / 1000000) + " milliseconds");
    }

    private static long memUsed(Runtime runtime) {
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static List<Pair<String, String>> buildInput() {
        List<Pair<String, String>> input = new ArrayList<>();
        input.add(new Pair<>("One", "1"));
        input.add(new Pair<>("Two", "2"));
        input.add(new Pair<>("Three", "3"));
        input.add(new Pair<>("Four", "4"));
        input.add(new Pair<>("Five", "5"));
        input.add(new Pair<>("Six", "6"));
        input.add(new Pair<>("Seven", "7"));
        input.add(new Pair<>("Eight", "8"));
        input.add(new Pair<>("Nine", "9"));
        input.add(new Pair<>("Ten", "10"));
        input.add(new Pair<>("Eleven", "11"));
        input.add(new Pair<>("Twelve", "12"));
        input.add(new Pair<>("Thirteen", "13"));
        input.add(new Pair<>("_14", "14"));
        input.add(new Pair<>("_15", "15"));
        input.add(new Pair<>("_16", "16"));
        input.add(new Pair<>("_17", "17"));
        input.add(new Pair<>("_18", "18"));
        input.add(new Pair<>("_19", "19"));
        input.add(new Pair<>("_20", "20"));
        input.add(new Pair<>("_21", "21"));
        input.add(new Pair<>("_22", "22"));
        input.add(new Pair<>("_23", "23"));
        input.add(new Pair<>("_24", "24"));
        input.add(new Pair<>("_25", "25"));
        input.add(new Pair<>("_26", "26"));
        input.add(new Pair<>("_27", "27"));
        input.add(new Pair<>("_28", "28"));
        input.add(new Pair<>("_29", "29"));
        input.add(new Pair<>("_30", "30"));
        input.add(new Pair<>("_31", "31"));
        input.add(new Pair<>("_32", "32"));
        input.add(new Pair<>("_33", "33"));
        input.add(new Pair<>("_34", "34"));
        input.add(new Pair<>("_35", "35"));
        return input;
    }
}
