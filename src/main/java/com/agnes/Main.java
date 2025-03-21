package com.agnes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VariableDataType.main(args);
        exe2();
    }

    public static void exe2() {
        /* control flow revision
         *Write a program that:
         *Takes an integer input from the user (representing your age).
         *Prints "You are an adult" if the age is 18 or older, and "You are a minor" if the age is less than 18.
         */
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        System.out.println("Enter your age");
        age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("you are an adult");
        } else {
            System.out.println("You are a minor");
        }
    }
}
