package org.apache.commons;

import org.junit.Test;
import static org.junit.Assert.*;

public class BooleanUtilsTest {

    @Test
    public void testIsFalseWithFalse() {
        assertTrue(BooleanUtils.isFalse(Boolean.FALSE)); // 应通过
    }

    @Test
    public void testIsFalseWithTrue() {
        assertFalse(BooleanUtils.isFalse(Boolean.TRUE)); // 应通过
    }

    @Test
    public void testIsFalseWithNull() {
        assertFalse(BooleanUtils.isFalse(null));         // 应通过
    }
}
