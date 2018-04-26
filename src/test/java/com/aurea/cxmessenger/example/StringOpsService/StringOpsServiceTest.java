package com.aurea.cxmessenger.example.StringOpsService;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * StringOpsService Test Class
 */
public class StringOpsServiceTest {

    private StringOpsService service;

    @Before
    public void setUp() throws Exception {
        service = new StringOpsService(null);
    }

    @Test
    public void concatenateTest() {
        assertEquals("ABC:DEF", service.concatenate(new String[] {"ABC", "DEF"}, ":"));
    }

    @Test
    public void splitTest() {
        assertEquals(3, service.split("A:BC:DEF", ":").length);
    }

    @Test
    public final void convertTest() {
        assertEquals(22.22f, service.convert(72), 0.1);
    }
}
