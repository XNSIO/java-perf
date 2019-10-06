package com.xnsio.perf;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachDataMapper {
    private final BucketData data = new BucketData();
    private final Map<String, BiConsumer<BucketData, Pair<String, String>>> fieldFunctions = new HashMap<>();

    public ForEachDataMapper() {
        init(fieldFunctions);

    }

    public static void init(Map<String, BiConsumer<BucketData, Pair<String, String>>> fieldFunctions) {
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
        fieldFunctions.put("14", (data, pair) -> data.set_14(pair.getValue()));
        fieldFunctions.put("15", (data, pair) -> data.set_15(pair.getValue()));
        fieldFunctions.put("16", (data, pair) -> data.set_16(pair.getValue()));
        fieldFunctions.put("17", (data, pair) -> data.set_17(pair.getValue()));
        fieldFunctions.put("18", (data, pair) -> data.set_18(pair.getValue()));
        fieldFunctions.put("19", (data, pair) -> data.set_19(pair.getValue()));
        fieldFunctions.put("20", (data, pair) -> data.set_20(pair.getValue()));
        fieldFunctions.put("21", (data, pair) -> data.set_21(pair.getValue()));
        fieldFunctions.put("22", (data, pair) -> data.set_22(pair.getValue()));
        fieldFunctions.put("23", (data, pair) -> data.set_23(pair.getValue()));
        fieldFunctions.put("24", (data, pair) -> data.set_24(pair.getValue()));
        fieldFunctions.put("25", (data, pair) -> data.set_25(pair.getValue()));
        fieldFunctions.put("26", (data, pair) -> data.set_26(pair.getValue()));
        fieldFunctions.put("27", (data, pair) -> data.set_27(pair.getValue()));
        fieldFunctions.put("28", (data, pair) -> data.set_28(pair.getValue()));
        fieldFunctions.put("29", (data, pair) -> data.set_29(pair.getValue()));
        fieldFunctions.put("30", (data, pair) -> data.set_30(pair.getValue()));
        fieldFunctions.put("31", (data, pair) -> data.set_31(pair.getValue()));
        fieldFunctions.put("32", (data, pair) -> data.set_32(pair.getValue()));
        fieldFunctions.put("33", (data, pair) -> data.set_33(pair.getValue()));
        fieldFunctions.put("34", (data, pair) -> data.set_34(pair.getValue()));
        fieldFunctions.put("35", (data, pair) -> data.set_35(pair.getValue()));
    }

    public void executeWithForEach(List<Pair<String, String>> input) {
        for (Pair<String, String> pair : input) {
            BiConsumer<BucketData, Pair<String, String>> consumer = fieldFunctions.get(pair.getKey().toLowerCase());
            if (consumer != null)
                consumer.accept(data, pair);
        }
    }

    public BucketData getData() {
        return data;
    }

    public static boolean executeForEach(List<Pair<String, String>> input) {
        ForEachDataMapper dataMapper = new ForEachDataMapper();
        dataMapper.executeWithForEach(input);
        dataMapper.executeWithForEach(input);
        dataMapper.executeWithForEach(input);
        return true;
    }
}
