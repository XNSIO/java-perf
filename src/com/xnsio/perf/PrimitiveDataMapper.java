package com.xnsio.perf;

import javafx.util.Pair;

import java.util.List;

public class PrimitiveDataMapper {
    private BucketData data = new BucketData();

    public void execute(List<Pair<String, String>> input) {
        for (Pair<String, String> pair : input)
            if (pair.getKey().equalsIgnoreCase("One"))
                data.setOne(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Two"))
                data.setTwo(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Three"))
                data.setThree(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Four"))
                data.setFour(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Five"))
                data.setFive(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Six"))
                data.setSix(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Seven"))
                data.setSeven(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Eight"))
                data.setEight(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Nine"))
                data.setNine(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Ten"))
                data.setTen(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Eleven"))
                data.setEleven(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Twelve"))
                data.setTwelve(pair.getValue());
            else if (pair.getKey().equalsIgnoreCase("Thirteen"))
                data.setThirteen(pair.getValue());
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
