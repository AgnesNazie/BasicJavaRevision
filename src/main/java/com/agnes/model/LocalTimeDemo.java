package com.agnes.model;

import java.time.LocalTime;
import java.util.Scanner;

public class LocalTimeDemo {
    public static void main(String[] args) {

    /*Ask the user to enter hour and minute, then:

Show the time they entered

Compare it to the current time (use isBefore() or isAfter())

Wanna try that or move to the next LocalTime concept?

     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the hour");

        LocalTime time = LocalTime.now();
        int hour = scanner.nextInt();
        System.out.println("Enter the minute");
        int minute = scanner.nextInt();
        System.out.println("Time is :" + hour + ":" + minute );
        System.out.println(time);

    }
}
