package com.xnsio.perf;

import javafx.util.Pair;

import java.util.List;

public class PrimitiveDataMapper {
    private BucketData data = new BucketData();

    public void execute(List<Pair<String, String>> input) {
        for (Pair<String, String> pair : input)

            if (pair.getKey().equalsIgnoreCase("_1"))
                data.set_1(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_2"))
                data.set_2(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_3"))
                data.set_3(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_4"))
                data.set_4(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_5"))
                data.set_5(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_6"))
                data.set_6(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_7"))
                data.set_7(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_8"))
                data.set_8(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_9"))
                data.set_9(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_10"))
                data.set_10(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_11"))
                data.set_11(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_12"))
                data.set_12(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_13"))
                data.set_13(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_14"))
                data.set_14(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_15"))
                data.set_15(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_16"))
                data.set_16(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_17"))
                data.set_17(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_18"))
                data.set_18(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_19"))
                data.set_19(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_20"))
                data.set_20(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_21"))
                data.set_21(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_22"))
                data.set_22(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_23"))
                data.set_23(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_24"))
                data.set_24(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_25"))
                data.set_25(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_26"))
                data.set_26(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_27"))
                data.set_27(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_28"))
                data.set_28(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_29"))
                data.set_29(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_30"))
                data.set_30(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_31"))
                data.set_31(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_32"))
                data.set_32(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_33"))
                data.set_33(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_34"))
                data.set_34(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("_35"))
                data.set_35(pair.getValue());

    }

    public BucketData getData() {
        return data;
    }

    public static boolean executePrimitive(List<Pair<String, String>> input) {
        PrimitiveDataMapper dataMapper = new PrimitiveDataMapper();
        dataMapper.execute(input);
        dataMapper.execute(input);
        dataMapper.execute(input);
        return true;
    }
}
