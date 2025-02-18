package basics.part_1;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate their sum: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        long sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
