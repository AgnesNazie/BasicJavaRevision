package com.agnes.model;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> intToString = number -> Integer.toString(number);
        String result = intToString.apply(5);
        System.out.println(result);
    }
}
