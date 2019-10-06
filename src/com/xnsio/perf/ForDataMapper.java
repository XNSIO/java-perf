package com.xnsio.perf;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForDataMapper {
    private final BucketData data = new BucketData();
    private final Map<String, BiConsumer<BucketData, Pair<String, String>>> fieldFunctions = new HashMap<>();

    public ForDataMapper() {
        fieldFunctions.put("one", (data1, pair) -> data1.setOne(pair.getValue()));
        fieldFunctions.put("two", (data1, pair) -> data1.setTwo(pair.getValue()));
        fieldFunctions.put("three", (data1, pair) -> data1.setThree(pair.getValue()));
        fieldFunctions.put("four", (data1, pair) -> data1.setFour(pair.getValue()));
        fieldFunctions.put("five", (data1, pair) -> data1.setFive(pair.getValue()));
        fieldFunctions.put("six", (data1, pair) -> data1.setSix(pair.getValue()));
        fieldFunctions.put("seven", (data1, pair) -> data1.setSeven(pair.getValue()));
        fieldFunctions.put("eight", (data1, pair) -> data1.setEight(pair.getValue()));
        fieldFunctions.put("nine", (data1, pair) -> data1.setNine(pair.getValue()));
        fieldFunctions.put("ten", (data1, pair) -> data1.setTen(pair.getValue()));
        fieldFunctions.put("eleven", (data1, pair) -> data1.setEleven(pair.getValue()));
        fieldFunctions.put("twelve", (data1, pair) -> data1.setTwelve(pair.getValue()));
        fieldFunctions.put("thirteen", (data1, pair) -> data1.setThirteen(pair.getValue()));
        fieldFunctions.put("14", (data1, pair) -> data1.set_14(pair.getValue()));
        fieldFunctions.put("15", (data1, pair) -> data1.set_15(pair.getValue()));
        fieldFunctions.put("16", (data1, pair) -> data1.set_16(pair.getValue()));
        fieldFunctions.put("17", (data1, pair) -> data1.set_17(pair.getValue()));
        fieldFunctions.put("18", (data1, pair) -> data1.set_18(pair.getValue()));
        fieldFunctions.put("19", (data1, pair) -> data1.set_19(pair.getValue()));
        fieldFunctions.put("20", (data1, pair) -> data1.set_20(pair.getValue()));
        fieldFunctions.put("21", (data1, pair) -> data1.set_21(pair.getValue()));
        fieldFunctions.put("22", (data1, pair) -> data1.set_22(pair.getValue()));
        fieldFunctions.put("23", (data1, pair) -> data1.set_23(pair.getValue()));
        fieldFunctions.put("24", (data1, pair) -> data1.set_24(pair.getValue()));
        fieldFunctions.put("25", (data1, pair) -> data1.set_25(pair.getValue()));
        fieldFunctions.put("26", (data1, pair) -> data1.set_26(pair.getValue()));
        fieldFunctions.put("27", (data1, pair) -> data1.set_27(pair.getValue()));
        fieldFunctions.put("28", (data1, pair) -> data1.set_28(pair.getValue()));
        fieldFunctions.put("29", (data1, pair) -> data1.set_29(pair.getValue()));
        fieldFunctions.put("30", (data1, pair) -> data1.set_30(pair.getValue()));
        fieldFunctions.put("31", (data1, pair) -> data1.set_31(pair.getValue()));
        fieldFunctions.put("32", (data1, pair) -> data1.set_32(pair.getValue()));
        fieldFunctions.put("33", (data1, pair) -> data1.set_33(pair.getValue()));
        fieldFunctions.put("34", (data1, pair) -> data1.set_34(pair.getValue()));
        fieldFunctions.put("35", (data1, pair) -> data1.set_35(pair.getValue()));
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
