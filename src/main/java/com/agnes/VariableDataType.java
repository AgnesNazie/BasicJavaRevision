package com.agnes;

import java.util.Scanner;

public class VariableDataType {
    public static void main(String[] args) {
        exe1();
        exe2();
    }

    public static void exe1() {

        //A variable to store your name
        String name = "Agnes Nazie";
        //A variable to store your age
        int age = 29;
        //A variable to store height in meters
        double height = 164.5;
        //A variable to check if i am a student
        boolean isStudent = true;
        //Print out the values of these variables
        System.out.println("My name is:" + name);
        System.out.println("I am :" + age + "years old");
        System.out.println("I am :" + height + "cm " + "tall");
        System.out.println("I am a student:" + isStudent);
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
