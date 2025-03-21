package com.agnes;

public class Arrays {
    public static void main(String[] args) {
        exe4();
    }

    public static void exe4() {

        /*Exercise 4: Arrays
         *Create an array of 5 integers and initialize it with the following values: 10, 20, 30, 40, 50.
         *Write a program that:
         *Prints the second element of the array.
         *Prints the sum of all the elements in the array.
         */
        int[] numbers = {10, 20, 30, 40, 50};
        int  sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The Index of the second element is " + numbers[1]);
        System.out.println("The sum is " + sum);
    }
}
