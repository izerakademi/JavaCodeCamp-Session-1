package com.company;

import java.util.Scanner;

public class InputSamples {

    static void Q1() {
        System.out.println("*********Q1***********");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Firstname : ");
        String firstName = scanner.next();
        System.out.print("Enter LastName  : ");
        String lastName = scanner.next();
        System.out.println(firstName + " " + lastName);
        System.out.println("*********Q1***********");
    }

    static void Q2() {
        System.out.println("*********Q2***********");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number  : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        int sub = number1 - number2;
        int mul = number1 * number2;
        double div = number1 / (double) number2;
        System.out.println("Sum : " + sum);
        System.out.println("Sub : " + sub);
        System.out.println("Mul : " + mul);
        System.out.println("Div : " + div);
        System.out.println("*********Q2***********");
    }

    static void Q3() {
        System.out.println("*********Q3***********");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Weight : ");
        int weight = scanner.nextInt();
        System.out.print("Enter Height : ");
        int height = scanner.nextInt();
        int area = weight * height;
        int env = 2 * (weight + height);
        System.out.println("Area : " + area);
        System.out.println("Env  : " + env);
        System.out.println("*********Q3***********");
    }

    static void Q4() {
        System.out.println("*********Q4***********");
        final double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double radius = scanner.nextDouble();
        double area = pi * radius * radius;
        double env = 2 * pi * radius;
        System.out.println("Area : " + area);
        System.out.println("Env  : " + env);
        System.out.println("*********Q4***********");
    }

    public static void main(String[] args) {
        System.out.println("Input Samples");
        //Q1();
        //Q2();
        //Q3();
        Q4();
    }
}
