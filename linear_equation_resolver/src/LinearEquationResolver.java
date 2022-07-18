// Tính nghiệm phương trình bậc nhất ax + b = c

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double result = (c - b) / a;
            System.out.printf("Equation pass with x = %.2f \n", result);
        }
        else {
            if (b == c) {
                System.out.println("The solution is all x");
            }
            else {
                System.out.println("No solution");
            }
        }
    }
}
