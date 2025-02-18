package basics.part_1;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate their Product: ");

        System.out.print("num1 = ");
        int num1 = input.nextInt();

        System.out.print("num2 = ");
        int num2 = input.nextInt();

        long prod = num1 * num2;
        System.out.println("The product is: " + prod);
    }
}
