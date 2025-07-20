package com.tt.test;

import java.util.Scanner;

class Problem1 {
    public void calculate(double a, double b, String op) {
        switch (op.toLowerCase()) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero");
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

public class javaQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem1 calc = new Problem1();

        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        calc.calculate(num1, num2, op);
    }
}
