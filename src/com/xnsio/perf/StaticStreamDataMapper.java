package com.xnsio.perf;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class StaticStreamDataMapper {
    private final BucketData data = new BucketData();
    private static final Map<String, BiConsumer<BucketData, Pair<String, String>>> fieldFunctions = new HashMap<String, BiConsumer<BucketData, Pair<String, String>>>(40, .95f) {
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
            put("14", (data, pair) -> data.set_14(pair.getValue()));
            put("15", (data, pair) -> data.set_15(pair.getValue()));
            put("16", (data, pair) -> data.set_16(pair.getValue()));
            put("17", (data, pair) -> data.set_17(pair.getValue()));
            put("18", (data, pair) -> data.set_18(pair.getValue()));
            put("19", (data, pair) -> data.set_19(pair.getValue()));
            put("20", (data, pair) -> data.set_20(pair.getValue()));
            put("21", (data, pair) -> data.set_21(pair.getValue()));
            put("22", (data, pair) -> data.set_22(pair.getValue()));
            put("23", (data, pair) -> data.set_23(pair.getValue()));
            put("24", (data, pair) -> data.set_24(pair.getValue()));
            put("25", (data, pair) -> data.set_25(pair.getValue()));
            put("26", (data, pair) -> data.set_26(pair.getValue()));
            put("27", (data, pair) -> data.set_27(pair.getValue()));
            put("28", (data, pair) -> data.set_28(pair.getValue()));
            put("29", (data, pair) -> data.set_29(pair.getValue()));
            put("30", (data, pair) -> data.set_30(pair.getValue()));
            put("31", (data, pair) -> data.set_31(pair.getValue()));
            put("32", (data, pair) -> data.set_32(pair.getValue()));
            put("33", (data, pair) -> data.set_33(pair.getValue()));
            put("34", (data, pair) -> data.set_34(pair.getValue()));
            put("35", (data, pair) -> data.set_35(pair.getValue()));
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
