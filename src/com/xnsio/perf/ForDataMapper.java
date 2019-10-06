package com.xnsio.perf;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForDataMapper {
    private final BucketData data = new BucketData();
    private final Map<String, BiConsumer<BucketData, Pair<String, String>>> fieldFunctions = new HashMap<>(40, 1);

    public ForDataMapper() {
        fieldFunctions.put("_1", (data1, pair) -> data1.set_1(pair.getValue()));
        fieldFunctions.put("_2", (data1, pair) -> data1.set_2(pair.getValue()));
        fieldFunctions.put("_3", (data1, pair) -> data1.set_3(pair.getValue()));
        fieldFunctions.put("_4", (data1, pair) -> data1.set_4(pair.getValue()));
        fieldFunctions.put("_5", (data1, pair) -> data1.set_5(pair.getValue()));
        fieldFunctions.put("_6", (data1, pair) -> data1.set_6(pair.getValue()));
        fieldFunctions.put("_7", (data1, pair) -> data1.set_7(pair.getValue()));
        fieldFunctions.put("_8", (data1, pair) -> data1.set_8(pair.getValue()));
        fieldFunctions.put("_9", (data1, pair) -> data1.set_9(pair.getValue()));
        fieldFunctions.put("_10", (data1, pair) -> data1.set_10(pair.getValue()));
        fieldFunctions.put("_11", (data1, pair) -> data1.set_11(pair.getValue()));
        fieldFunctions.put("_12", (data1, pair) -> data1.set_12(pair.getValue()));
        fieldFunctions.put("_13", (data1, pair) -> data1.set_13(pair.getValue()));
        fieldFunctions.put("_14", (data1, pair) -> data1.set_14(pair.getValue()));
        fieldFunctions.put("_15", (data1, pair) -> data1.set_15(pair.getValue()));
        fieldFunctions.put("_16", (data1, pair) -> data1.set_16(pair.getValue()));
        fieldFunctions.put("_17", (data1, pair) -> data1.set_17(pair.getValue()));
        fieldFunctions.put("_18", (data1, pair) -> data1.set_18(pair.getValue()));
        fieldFunctions.put("_19", (data1, pair) -> data1.set_19(pair.getValue()));
        fieldFunctions.put("_20", (data1, pair) -> data1.set_20(pair.getValue()));
        fieldFunctions.put("_21", (data1, pair) -> data1.set_21(pair.getValue()));
        fieldFunctions.put("_22", (data1, pair) -> data1.set_22(pair.getValue()));
        fieldFunctions.put("_23", (data1, pair) -> data1.set_23(pair.getValue()));
        fieldFunctions.put("_24", (data1, pair) -> data1.set_24(pair.getValue()));
        fieldFunctions.put("_25", (data1, pair) -> data1.set_25(pair.getValue()));
        fieldFunctions.put("_26", (data1, pair) -> data1.set_26(pair.getValue()));
        fieldFunctions.put("_27", (data1, pair) -> data1.set_27(pair.getValue()));
        fieldFunctions.put("_28", (data1, pair) -> data1.set_28(pair.getValue()));
        fieldFunctions.put("_29", (data1, pair) -> data1.set_29(pair.getValue()));
        fieldFunctions.put("_30", (data1, pair) -> data1.set_30(pair.getValue()));
        fieldFunctions.put("_31", (data1, pair) -> data1.set_31(pair.getValue()));
        fieldFunctions.put("_32", (data1, pair) -> data1.set_32(pair.getValue()));
        fieldFunctions.put("_33", (data1, pair) -> data1.set_33(pair.getValue()));
        fieldFunctions.put("_34", (data1, pair) -> data1.set_34(pair.getValue()));
        fieldFunctions.put("_35", (data1, pair) -> data1.set_35(pair.getValue()));
    }

    public Boolean execute(List<Pair<String, String>> input) {
        for (int i = 0; i < input.size(); i++) {
            Pair<String, String> pair = input.get(i);
            BiConsumer<BucketData, Pair<String, String>> consumer = fieldFunctions.get(pair.getKey().toLowerCase());
            if (consumer != null)
                consumer.accept(data, pair);
        }
        return true;
    }

    public BucketData getData() {
        return data;
    }

    public static Boolean _execute(List<Pair<String, String>> input) {
        return new ForDataMapper().execute(input);
    }
}
