package basics.part_1;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate their Product: ");

        System.out.print("num1 = ");
        int num1 = input.nextInt();

        System.out.print("num2 = ");
        int num2 = input.nextInt();

        System.out.println("\n################ Basic Arithmetic Operations ################");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

        input.close();
    }
}
