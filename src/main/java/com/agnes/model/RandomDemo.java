package com.agnes.model;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int dice = random.nextInt(6) + 1;
        System.out.println("Guest a number between 1 and 6");
        int number = scanner.nextInt();
        if (number == dice) {
            System.out.println("Correct! 🎉 The number was: " + dice);
        } else {
            System.out.println("Wrong! ❌ The number was: " + dice);
        }

    }
}
