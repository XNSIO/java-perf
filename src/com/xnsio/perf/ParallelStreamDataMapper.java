package com.xnsio.perf;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import static com.xnsio.perf.ForEachDataMapper.init;

public class ParallelStreamDataMapper {
    private final BucketData data = new BucketData();
    private final Map<String, BiConsumer<BucketData, Pair<String, String>>> fieldFunctions = new HashMap<>();

    public ParallelStreamDataMapper() {
        init(fieldFunctions);
    }

    public void executeWithParallelStream(List<Pair<String, String>> input) {
        input.parallelStream().forEach(pair -> {
            BiConsumer<BucketData, Pair<String, String>> consumer = fieldFunctions.get(pair.getKey().toLowerCase());
            if (consumer != null)
                consumer.accept(data, pair);
        });
    }

    public BucketData getData() {
        return data;
    }

    public static boolean executeParallelStream(List<Pair<String, String>> input) {
        ParallelStreamDataMapper dataMapper = new ParallelStreamDataMapper();
        dataMapper.executeWithParallelStream(input);
        dataMapper.executeWithParallelStream(input);
        dataMapper.executeWithParallelStream(input);
        return true;
    }

}
