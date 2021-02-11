package com.rancard.dockerjenkingsintegrationssample.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void add() {
        MathUtils mathUtils = new MathUtils();

        int expected = 1;
        int actual = 4;
        assertEquals(expected,mathUtils.add(0,1));
        System.out.println();
    }
}
