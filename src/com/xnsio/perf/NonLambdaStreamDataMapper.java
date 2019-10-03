package com.xnsio.perf;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonLambdaStreamDataMapper {
    private interface Function {
        void execute(BucketData bucket, Pair<String, String> pair);
    }
    private final BucketData data = new BucketData();
    private final Map<String, Function> fieldFunctions = new HashMap<>();

    public NonLambdaStreamDataMapper() {
        fieldFunctions.put("one", new Function() {
            @Override
            public void execute(BucketData bucket, Pair<String, String> pair) {
                data.setOne(pair.getValue());
            }
        });
        fieldFunctions.put("two", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setTwo(pair.getValue());
            }
        });
        fieldFunctions.put("three", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setThree(pair.getValue());
            }
        });
        fieldFunctions.put("four", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setFour(pair.getValue());
            }
        });
        fieldFunctions.put("five", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setFive(pair.getValue());
            }
        });
        fieldFunctions.put("six", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setSix(pair.getValue());
            }
        });
        fieldFunctions.put("seven", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setSeven(pair.getValue());
            }
        });
        fieldFunctions.put("eight", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setEight(pair.getValue());
            }
        });
        fieldFunctions.put("nine", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setNine(pair.getValue());
            }
        });
        fieldFunctions.put("ten", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setTen(pair.getValue());
            }
        });
        fieldFunctions.put("eleven", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setEleven(pair.getValue());
            }
        });
        fieldFunctions.put("twelve", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setTwelve(pair.getValue());
            }
        });
        fieldFunctions.put("thirteen", new Function() {
            @Override
            public void execute(BucketData data, Pair<String, String> pair) {
                data.setThirteen(pair.getValue());
            }
        });
    }

    public void executeWithStream(List<Pair<String, String>> input) {
        input.forEach(pair -> {
            Function consumer = fieldFunctions.get(pair.getKey().toLowerCase());
            if (consumer != null)
                consumer.execute(data, pair);
        });
    }

    public BucketData getData() {
        return data;
    }

    public static boolean executeStream(List<Pair<String, String>> input) {
        NonLambdaStreamDataMapper dataMapper = new NonLambdaStreamDataMapper();
        dataMapper.executeWithStream(input);
        dataMapper.executeWithStream(input);
        dataMapper.executeWithStream(input);
        return true;
    }

}
