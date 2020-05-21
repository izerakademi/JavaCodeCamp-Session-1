package com.company;

import java.util.Scanner;

public class ConditionalStatements {


    static void Q1() {
        System.out.println("*********Q1***********");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        System.out.println("*********Q1***********");
    }

    static void Q2() {
        System.out.println("*********Q2***********");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int number1 = scanner.nextInt();

        System.out.print("Enter Number 2 : ");
        int number2 = scanner.nextInt();

        System.out.print("Enter Operator : ");
        char operator = scanner.next().charAt(0);
        // +
        switch (operator) {
            case '+':
                System.out.println("Sum : " + (number1 + number2));
                break;
            case '-':
                System.out.println("Sub : " + (number1 - number2));
                break;
            case '*':
                System.out.println("Mul :" + (number1 * number2));
                break;
            case '/':
                System.out.println("Div :" + (number1 / (double) number2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println("*********Q2***********");
    }


    public static void main(String[] args) {
        System.out.println("ConditionalStatements"); // Koşullu İfadeler

        //Q1();
        Q2();


        int number1 = 5;
        int number2 = 6;

        if (number1 > number2) {
            System.out.println("Number1 is bigger than Number2");
        }

        if (number2 > number1) {
            System.out.println("Number2 is bigger than Number1");
        }

        if (number1 == number2) {
            System.out.println("Number1 is equal to Number2");
        }

        // IF - ELSE

        if (number1 > number2) {
            System.out.println("Number1 is bigger than Number2");
        } else if (number2 > number1) {
            System.out.println("Number2 is bigger than Number1");
        } else {
            System.out.println("Number1 is equal to Number2");
        }

        // SWITCH
        int day = 9;
        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lütfen geçerli bir sayı giriniz.");
        }


    }
}
