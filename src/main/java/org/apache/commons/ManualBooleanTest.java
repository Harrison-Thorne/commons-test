package org.apache.commons;

public class ManualBooleanTest {
    public static void main(String[] args) {
        System.out.println("Test Boolean.FALSE: " + BooleanUtils.isFalse(Boolean.FALSE)); // 应为 true，返回 false
        System.out.println("Test Boolean.TRUE: " + BooleanUtils.isFalse(Boolean.TRUE));   // 应为 false，返回 true
        System.out.println("Test null: " + BooleanUtils.isFalse(null));                   // false
    }
}
