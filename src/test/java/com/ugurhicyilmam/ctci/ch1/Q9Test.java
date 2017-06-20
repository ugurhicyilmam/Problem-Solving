package com.ugurhicyilmam.ctci.ch1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q9Test {
    @Test
    public void test_isRotationDumb() throws Exception {
        assertTrue(Q9.isRotationDumb("waterbottle", "erbottlewat"));
        assertFalse(Q9.isRotationDumb("waterbottle", "arbottlewat"));
        assertTrue(Q9.isRotationDumb("waterbottle", "waterbottle"));
        assertTrue(Q9.isRotationDumb("erbottlewat", "waterbottle"));
    }

    @Test
    public void test_isRotationSmart() throws Exception {
        assertTrue(Q9.isRotationSmart("waterbottle", "erbottlewat"));
        assertFalse(Q9.isRotationSmart("waterbottle", "arbottlewat"));
        assertTrue(Q9.isRotationSmart("waterbottle", "waterbottle"));
        assertTrue(Q9.isRotationSmart("erbottlewat", "waterbottle"));
    }
}