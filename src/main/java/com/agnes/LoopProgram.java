package com.agnes;

public class LoopProgram {
    public static void main (String[] args) {
        /*Exercise 3: Loop Practice
         *Write a program that prints the numbers from 1 to 10 using a for loop.
         *Write a program that prints the even numbers between 1 and 20 using a while loop
         *Write a program that prints "I love Java!" five times using a do-while loop.
         */
        exe3a();
        exe3b();
        exe3c();
    }

    public static void exe3a() {
        System.out.println("Exercise a");
        System.out.print("Numbers are: ");
        int number = 10;
        for (int i = 0; i < number; i++) {
            System.out.print(" " + i);
        }
    }

    public static void exe3b() {
        System.out.print("\nExercise b");
        System.out.print("\nEven numbers  are: ");
        int numbers = 1;
        int limit = 20;
        while (numbers <= limit) {
            if (numbers % 2 == 0) {
                System.out.print( " " + numbers);
            }
            numbers++;
        }

    }
    public  static void exe3c() {
        int i = 0;
        do {
            System.out.println("I love Java ");
            i++;
        } while (i < 5 + 1);
    }
}