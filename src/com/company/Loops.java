package com.company;

import java.util.Scanner;

public class Loops {

    static void Q1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("Sum : " + sum);
    }

    static void Q2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        int mul = 1;
        for (int i = 1; i <= number; i++) {
            mul = mul * i;
        }
        System.out.println("Mul :" + mul);
    }

    static void Q3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        int evenCounter = 0;
        int oddCounter = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        System.out.println("Even Count : " + evenCounter);
        System.out.println("Odd Count  : " + oddCounter);
    }

    static void Q4() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }

    static void Q5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        System.out.println(n + " Fact : " + result);
    }

    static void Q6() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter Number : ");
            int number = scanner.nextInt();
            if (number != -1) {
                sum = sum + number;
            } else if (number == -1) {
                break;
            }
        }
        System.out.println("Sum : " + sum);
    }

    static void Q7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        String result = (number > 0) ? "Number is greater than 0" : "Number is less than or equal to 0";
        System.out.println(result);
    }


    public static void main(String[] args) {
        //Q1();
        //Q2();
        //Q3();
        //Q4();
        //Q5();
        //Q6();
        Q7();
        // FOR LOOP - FOR DÖNGÜSÜ
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("********************");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("********************");

        for (int i = 1; i < 11; i += 2) {
            System.out.println(i);
        }

        System.out.println("********************");

        for (int i = 10; i > 0; i -= 2) {
            System.out.println(i);
        }

        System.out.println("********************");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // System.out.println(j);
            }
        }

        // WHILE LOOP - WHILE Döngüsü
        System.out.println("*****************");

        int index = 1;
        while (index < 10) {
            System.out.println(index);
            index++;
        }
        System.out.println("*****************");
        // BREAK - CONTINUE
        index = 1;
        while (index < 10) {
            System.out.println(index);
            if (index == 5) {
                index++;
                continue;
            }
            if (index == 7) {
                break;
            }
            index++;
        }
        System.out.println("*****************");

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

        // DO -WHILE
        System.out.println("*****************");
        int doCounter = 1;
        do {
            System.out.println(doCounter);
            doCounter++;
        } while (doCounter < 11);


    }
}
