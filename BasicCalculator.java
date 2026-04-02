import java.util.Scanner;

class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
}

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result: " + calc.add(a, b)); break;
            case 2: System.out.println("Result: " + calc.subtract(a, b)); break;
            case 3: System.out.println("Result: " + calc.multiply(a, b)); break;
            case 4: System.out.println("Result: " + calc.divide(a, b)); break;
            default: System.out.println("Invalid choice");
        }
    }
}