package com.xnsio.perf;

import javafx.util.Pair;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DataMapperTest {
    @Test
    public void test() {
        List<Pair<String, String>> input = Main.buildInput();
        StreamDataMapper dataMapper = new StreamDataMapper();
        dataMapper.executeWithStream(input);
        assertDataBucket(dataMapper.getData());
    }

    @Test
    public void testPrimitive() throws Exception {
        PrimitiveDataMapper dataMapper = new PrimitiveDataMapper();
        List<Pair<String, String>> input = Main.buildInput();
        dataMapper.execute(input);
        assertDataBucket(dataMapper.getData());
    }

    private void assertDataBucket(BucketData data) {
        assertEquals("1", data.get_1());
        assertEquals("2", data.get_2());
        assertEquals("3", data.get_3());
        assertEquals("4", data.get_4());
        assertEquals("13", data.get_13());
        assertEquals("35", data.get_35());
    }
}
