package com.agnes.model;

import java.util.function.*;

public class FunctionDemo {
    public static void main(String[] args) {
        exe1();
        exe2();
        exe3();
        Function<Integer, Integer> intToString = number -> number * 10;
        int result = intToString.apply(5);
        System.out.println(result);
    }

    public static void exe1() {
        Function<String, String> stringToInt = name -> name.toUpperCase();
        String result1 = stringToInt.apply("java " + "hello");
        System.out.println(result1);
    }

    public static void exe2() {
        Consumer<String> names = name -> System.out.println(name);
        names.accept("Agnes");
    }

    public static void exe3() {

        Consumer<Integer> number = num -> System.out.println(num * num);
        number.accept(5);

        Consumer<String> place = name -> System.out.println("Welcome to " + name);
        place.accept("java");
        place.accept("ChatGpt");
        Consumer<String> name = places -> System.out.println(places.toUpperCase());
        name.accept("java");
        Consumer<String> names = places -> System.out.println(places + " !!!");
        names.accept("java");
        Predicate<Integer> isEven = numb -> numb % 2 == 0;
        System.out.println(isEven.test(4));
        Predicate<String> isLongerThan5Words = words -> words.length() > 5;
        System.out.println(isLongerThan5Words.test("hello"));
        Predicate<Integer> isPositiveAndIsEven = num -> num > 0 && num % 2 == 0;
        System.out.println(isPositiveAndIsEven.test(4));
        System.out.println(isPositiveAndIsEven.test(-2));
        Predicate<Integer> isPositive = num -> num > 0;
        Predicate<Integer> isEvens = num -> num % 2 == 0;
        Predicate<Integer> isPositiveAndEvens = isPositive.and(isEvens);
        System.out.println(isPositiveAndEvens.test(5));
        Supplier<String> supplier = () -> "Java is awesome";
        System.out.println(supplier.get());
        UnaryOperator<Integer> doubleNumber = n -> n * 2;
        System.out.println(doubleNumber.apply(10));
        UnaryOperator<Integer> squareNumber = n -> n * n;
        System.out.println(squareNumber.apply(4));
        BinaryOperator<Integer> subtract = (a, b) -> a - b;
        System.out.println(subtract.apply(20, 5));
        BiPredicate<Integer, Integer> isEvenss = (a, b) -> a % 2 == 0 && b % 2 ==0;
        System.out.println(isEvenss.test(4,6));
        BiFunction<String,Integer,String> concate = (a, b) -> a +  b;
        System.out.println(concate.apply("Hello", 2025));
    }
}