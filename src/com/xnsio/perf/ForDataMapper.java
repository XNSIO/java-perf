package com.xnsio.perf;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import static com.xnsio.perf.ForEachDataMapper.init;

public class ForDataMapper {
    private final BucketData data = new BucketData();
    private final Map<String, BiConsumer<BucketData, Pair<String, String>>> fieldFunctions = new HashMap<>();

    public ForDataMapper() {
        init(fieldFunctions);
    }

    public void execute(List<Pair<String, String>> input) {
        for (int i = 0; i < input.size(); i++) {
            Pair<String, String> pair = input.get(i);
            BiConsumer<BucketData, Pair<String, String>> consumer = fieldFunctions.get(pair.getKey().toLowerCase());
            if (consumer != null)
                consumer.accept(data, pair);
        }
    }

    public BucketData getData() {
        return data;
    }

    public static boolean executeFor(List<Pair<String, String>> input) {
        ForDataMapper dataMapper = new ForDataMapper();
        dataMapper.execute(input);
        dataMapper.execute(input);
        dataMapper.execute(input);
        return true;
    }

}
