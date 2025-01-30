package java_controflow.conditional_statement;

import java.util.Scanner;

public class SolveQuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("############################# Solve Quadratic Equation 'aX² + bX + c = 0' #################################");
        System.out.println("\nEnter the parameters of the quadratic equation :");
        System.out.print("Entre a (the coefficient of X²) : ");
        double a = input.nextDouble();
        System.out.print("Entre b (the coefficient of X) : ");
        double b = input.nextDouble();
        System.out.print("Entre c (the constant) : ");
        double c = input.nextDouble();

        System.out.println("##################### Calculation of Delta ###########################");
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta = "+delta);

        System.out.println();

        if (delta < 0) {
            System.out.println("No Real Solutions");
        }else if (delta > 0) {
            System.out.println("################ Two Real and Distinct Solutions ####################");
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("X1 = " + x1 + " AND X2 = " + x2);
        }else {
            System.out.println("################ One Real Solution (Repeated Root): ####################");
            double x = -b / 2 * a;
            System.out.println("X = "+ x);
        }
    }


}
