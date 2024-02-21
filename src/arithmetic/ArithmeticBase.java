/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

public class ArithmeticBase {
    public double calculate(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y != 0) {
                    return x / y;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }

    public static void main(String[] args) {
        ArithmeticBase arithmeticBase = new ArithmeticBase();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double x = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double y = scanner.nextDouble();

        System.out.print("Enter arithmetic operation (PLUS, MINUS, TIMES, DIVIDE): ");
        Operation operation = Operation.valueOf(scanner.next().toUpperCase());

        double result = arithmeticBase.calculate(x, y, operation);
        System.out.println("Result: " + result);
    }

    double calculate(int m, int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


