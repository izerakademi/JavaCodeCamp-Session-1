package com.company;

public class Operators {

    public static void main(String[] args) {
        System.out.println("Operators");

        // Arithmetic Operators

        double result = ((((20 * 7) / 3) - 18) + 10) % 3;
        System.out.println("Result " + result);

        int number = 10;
        number = number + 1;
        System.out.println("Number : " + number);
        number++;
        System.out.println("Number : " + number);

        number = number - 1;
        System.out.println("Number : " + number);
        number--;
        System.out.println("Number : " + number);

        int x = 5;
        x += 5;
        System.out.println("x :" + x);
        x -= 6;
        System.out.println("x :" + x);
        x *= 3;
        System.out.println("x :" + x);
        x /= 3;
        System.out.println("x :" + x);
        System.out.println("***********************");

        int num1 = 5;
        int num2 = 10;

        boolean are_these_numbers_equal = num1 == num2;
        System.out.println(are_these_numbers_equal);

        boolean arent_these_numbers_equal = num1 != num2;
        System.out.println(arent_these_numbers_equal);

        boolean is_num1_greater_than_num2 = num1 > num2;
        System.out.println(is_num1_greater_than_num2);

        boolean is_num2_greater_than_num1 = num2 > num1;
        System.out.println(is_num2_greater_than_num1);

        boolean is_num1_less_than_num2 = num1 < num2;
        System.out.println(is_num1_less_than_num2);

        boolean is_num2_less_than_num1 = num2 < num1;
        System.out.println(is_num2_less_than_num1);

        boolean is_num2_greater_than_or_equal_to_num1 = num2 >= num1;
        System.out.println(is_num2_greater_than_or_equal_to_num1);

        boolean is_num1_greater_than_or_equal_to_num2 = num1 >= num2;
        System.out.println(is_num1_greater_than_or_equal_to_num2);

        // Logical Operators
        /*
         * && And
         * || Or
         * */
        System.out.println("********************");
        int a = 5;
        int b = 10;
        int c = 9;

        boolean is_c_greater_than_a = c > a;
        boolean is_c_greater_than_b = c > b;

        boolean is_c_greater_than_a_and_b = (is_c_greater_than_a) && (is_c_greater_than_b);
        System.out.println(is_c_greater_than_a_and_b);

        boolean is_c_greater_than_a_or_b = (is_c_greater_than_a) || (is_c_greater_than_b);
        System.out.println(is_c_greater_than_a_or_b);

    }
}
