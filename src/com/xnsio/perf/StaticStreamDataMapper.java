package com.xnsio.perf;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class StaticStreamDataMapper {
    private final BucketData data = new BucketData();
    private static final Map<String, BiConsumer<BucketData, Pair<String, String>>> fieldFunctions = new HashMap<String, BiConsumer<BucketData, Pair<String, String>>>(40, 1) {
        {
            put("_1", (data, pair) -> data.set_1(pair.getValue()));
            put("_2", (data, pair) -> data.set_2(pair.getValue()));
            put("_3", (data, pair) -> data.set_3(pair.getValue()));
            put("_4", (data, pair) -> data.set_4(pair.getValue()));
            put("_5", (data, pair) -> data.set_5(pair.getValue()));
            put("_6", (data, pair) -> data.set_6(pair.getValue()));
            put("_7", (data, pair) -> data.set_7(pair.getValue()));
            put("_8", (data, pair) -> data.set_8(pair.getValue()));
            put("_9", (data, pair) -> data.set_9(pair.getValue()));
            put("_10", (data, pair) -> data.set_10(pair.getValue()));
            put("_11", (data, pair) -> data.set_11(pair.getValue()));
            put("_12", (data, pair) -> data.set_12(pair.getValue()));
            put("_13", (data, pair) -> data.set_13(pair.getValue()));
            put("_14", (data, pair) -> data.set_14(pair.getValue()));
            put("_15", (data, pair) -> data.set_15(pair.getValue()));
            put("_16", (data, pair) -> data.set_16(pair.getValue()));
            put("_17", (data, pair) -> data.set_17(pair.getValue()));
            put("_18", (data, pair) -> data.set_18(pair.getValue()));
            put("_19", (data, pair) -> data.set_19(pair.getValue()));
            put("_20", (data, pair) -> data.set_20(pair.getValue()));
            put("_21", (data, pair) -> data.set_21(pair.getValue()));
            put("_22", (data, pair) -> data.set_22(pair.getValue()));
            put("_23", (data, pair) -> data.set_23(pair.getValue()));
            put("_24", (data, pair) -> data.set_24(pair.getValue()));
            put("_25", (data, pair) -> data.set_25(pair.getValue()));
            put("_26", (data, pair) -> data.set_26(pair.getValue()));
            put("_27", (data, pair) -> data.set_27(pair.getValue()));
            put("_28", (data, pair) -> data.set_28(pair.getValue()));
            put("_29", (data, pair) -> data.set_29(pair.getValue()));
            put("_30", (data, pair) -> data.set_30(pair.getValue()));
            put("_31", (data, pair) -> data.set_31(pair.getValue()));
            put("_32", (data, pair) -> data.set_32(pair.getValue()));
            put("_33", (data, pair) -> data.set_33(pair.getValue()));
            put("_34", (data, pair) -> data.set_34(pair.getValue()));
            put("_35", (data, pair) -> data.set_35(pair.getValue()));
        }
    };

    public Boolean execute(List<Pair<String, String>> input) {
        input.forEach(pair -> {
            BiConsumer<BucketData, Pair<String, String>> consumer = fieldFunctions.get(pair.getKey().toLowerCase());
            if (consumer != null)
                consumer.accept(data, pair);
        });
        return true;
    }

    public BucketData getData() {
        return data;
    }

    public static Boolean _execute(List<Pair<String, String>> input) {
        return new StaticStreamDataMapper().execute(input);
    }
}
