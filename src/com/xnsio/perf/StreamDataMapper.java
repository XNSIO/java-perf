package com.xnsio.perf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import javafx.util.Pair;

public class StreamDataMapper {
    private final BucketData data = new BucketData();
    private final Map<String, BiConsumer<BucketData, Pair<String, String>>> fieldFunctions = new HashMap<>();

    public StreamDataMapper() {
        fieldFunctions.put("one", (data, pair) -> data.setOne(pair.getValue()));
        fieldFunctions.put("two", (data, pair) -> data.setTwo(pair.getValue()));
        fieldFunctions.put("three", (data, pair) -> data.setThree(pair.getValue()));
        fieldFunctions.put("four", (data, pair) -> data.setFour(pair.getValue()));
        fieldFunctions.put("five", (data, pair) -> data.setFive(pair.getValue()));
        fieldFunctions.put("six", (data, pair) -> data.setSix(pair.getValue()));
        fieldFunctions.put("seven", (data, pair) -> data.setSeven(pair.getValue()));
        fieldFunctions.put("eight", (data, pair) -> data.setEight(pair.getValue()));
        fieldFunctions.put("nine", (data, pair) -> data.setNine(pair.getValue()));
        fieldFunctions.put("ten", (data, pair) -> data.setTen(pair.getValue()));
        fieldFunctions.put("eleven", (data, pair) -> data.setEleven(pair.getValue()));
        fieldFunctions.put("twelve", (data, pair) -> data.setTwelve(pair.getValue()));
        fieldFunctions.put("thirteen", (data, pair) -> data.setThirteen(pair.getValue()));
    }

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
        StreamDataMapper dataMapper = new StreamDataMapper();
        dataMapper.executeWithStream(input);
        dataMapper.executeWithStream(input);
        dataMapper.executeWithStream(input);
        return true;
    }
}
