package basics.methods;

import java.util.Scanner;

public class ComputeAverage {
    public static double computeAverage(double x, double y, double z) {
        return (x + y + z) / 3;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("################################ Compute Average of Three Numbers ################################");

        System.out.print("Enter the first number : ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number : ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number : ");
        double num3 = input.nextDouble();

        System.out.println("The Average of Three Numbers is : "+computeAverage(num1, num2, num3));
    }
}
