package com.agnes.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        exe1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number = scanner.nextInt();
        System.out.println("Enter your second number");
        int numb = scanner.nextInt();
        System.out.println("Choose operation (+, -, *, /)");
        String operator = scanner.next();
        int result;

        switch (operator) {
            case "+":

                result = number + numb;
                System.out.println(result);
                break;
            case "-":
                result = number - numb;
                System.out.println(result);
                break;
            case "/":
                result = number / numb;
                System.out.println(result);
                break;
            case "*":
                result = number * numb;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid choice");

        }
        scanner.close();

    }
    public  static  void exe1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your birth year");
        int year = scanner.nextInt();
        System.out.println("enter your birth month");
        int month = scanner.nextInt();
        System.out.println( "enter the day");
        int day = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(year,month,day);
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is " + today);
        System.out.println("your birthday is:" + year + "-" + month + "-" + day );
        Period age = Period.between(birthDate, today);
        System.out.println("you are " + age.getYears() + " years old");
        DayOfWeek days = birthDate.getDayOfWeek();
        System.out.println("You were born on a:" + days);

    }
}
