package com.project2.calculator;
public class Calculator {

    /**
     * Add two given values
     * @param x first value
     * @param y second value
     * @return total
     */
    public static int add(int x, int y){
        return x+y;
    }

    /**
     * Subtract two given values, being 'x' the minuend and 'y' the subtrahend
     * @param x first value
     * @param y second value
     * @return total
     */
    public static int subtract(int x, int y){
        return x-y;
    }

    /**
     * Multiply two given values
     * @param x first value
     * @param y second value
     * @return total
     */
    public static int multiply(int x, int y){
        return x*y;
    }

    /**
     * Divide two given values, being 'x' the dividend  and 'y' the divisor
     * @param x first value
     * @param y second value
     * @return total
     */
    public static int divide(int x, int y){
        return x/y;
    }
}
