package basics.methods;

import java.util.Scanner;

public class FindSmallest {

    public static double findSmallestNumber(double num1, double num2, double num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();

        System.out.println("################################ Find the smallest number among three numbers ################################");

        System.out.print("Enter the first number : ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number : ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number : ");
        double num3 = input.nextDouble();

        System.out.println();

        System.out.println("The smallest number among three numbers is : " + findSmallestNumber(num1, num2, num3));
    }
}
