package com.xnsio.perf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonLambdaStreamDataMapper {
    private interface Function {
        void execute(BucketData bucket, Pair pair);
    }
    private final BucketData data = new BucketData();
    private final Map<String, Function> fieldFunctions = new HashMap<>(40, 1);

    public NonLambdaStreamDataMapper() {
        fieldFunctions.put("_1", new Function() {
            @Override
            public void execute(BucketData bucket, Pair pair) {
                data.set_1(pair.getValue());
            }
        });
        fieldFunctions.put("_2", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_2(pair.getValue());
            }
        });
        fieldFunctions.put("_3", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_3(pair.getValue());
            }
        });
        fieldFunctions.put("_4", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_4(pair.getValue());
            }
        });
        fieldFunctions.put("_5", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_5(pair.getValue());
            }
        });
        fieldFunctions.put("_6", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_6(pair.getValue());
            }
        });
        fieldFunctions.put("_7", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_7(pair.getValue());
            }
        });
        fieldFunctions.put("_8", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_8(pair.getValue());
            }
        });
        fieldFunctions.put("_9", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_9(pair.getValue());
            }
        });
        fieldFunctions.put("_10", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_10(pair.getValue());
            }
        });
        fieldFunctions.put("_11", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_11(pair.getValue());
            }
        });
        fieldFunctions.put("_12", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_12(pair.getValue());
            }
        });
        fieldFunctions.put("_13", new Function() {
            @Override
            public void execute(BucketData data, Pair pair) {
                data.set_13(pair.getValue());
            }
        });

    }

    public Boolean execute(List<Pair> input) {
        input.forEach(pair -> {
            Function consumer = fieldFunctions.get(pair.getKey().toLowerCase());
            if (consumer != null)
                consumer.execute(data, pair);
        });
        return true;
    }

    public BucketData getData() {
        return data;
    }

    public static Boolean _execute(List<Pair> input) {
        return new NonLambdaStreamDataMapper().execute(input);
    }
}
