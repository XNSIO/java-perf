package com.xnsio.perf;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class StaticStreamDataMapper {
    private final BucketData data = new BucketData();
    private static final Map<String, BiConsumer<BucketData, Pair<String, String>>> fieldFunctions = new HashMap<String, BiConsumer<BucketData, Pair<String, String>>>() {
        {
            put("one", (data, pair) -> data.setOne(pair.getValue()));
            put("two", (data, pair) -> data.setTwo(pair.getValue()));
            put("three", (data, pair) -> data.setThree(pair.getValue()));
            put("four", (data, pair) -> data.setFour(pair.getValue()));
            put("five", (data, pair) -> data.setFive(pair.getValue()));
            put("six", (data, pair) -> data.setSix(pair.getValue()));
            put("seven", (data, pair) -> data.setSeven(pair.getValue()));
            put("eight", (data, pair) -> data.setEight(pair.getValue()));
            put("nine", (data, pair) -> data.setNine(pair.getValue()));
            put("ten", (data, pair) -> data.setTen(pair.getValue()));
            put("eleven", (data, pair) -> data.setEleven(pair.getValue()));
            put("twelve", (data, pair) -> data.setTwelve(pair.getValue()));
            put("thirteen", (data, pair) -> data.setThirteen(pair.getValue()));
        }
    };

    public void executeWithStream(List<Pair<String, String>> input) {
        input.forEach(pair -> {
            BiConsumer<BucketData, Pair<String, String>> consumer = fieldFunctions.get(pair.getKey().toLowerCase());
            if (consumer != null)
                consumer.accept(data, pair);
        });
    }

    public BucketData getData() {
        return data;
    }

    public static boolean executeStream(List<Pair<String, String>> input) {
        StaticStreamDataMapper dataMapper = new StaticStreamDataMapper();
        dataMapper.executeWithStream(input);
        dataMapper.executeWithStream(input);
        dataMapper.executeWithStream(input);
        return true;
    }
}
