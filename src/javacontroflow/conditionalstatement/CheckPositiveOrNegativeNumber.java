package javacontroflow.conditionalstatement;

import java.util.Scanner;

public class CheckPositiveOrNegativeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");

        double num = input.nextDouble();

        System.out.println();

        if(num > 0) {
            System.out.println("Your number : " + num + " is positive.");
        }else if (num == 0) {
            System.out.println("Your number is zero");
        }
        else {
            System.out.println("Your number : " + num + " is negative.");
        }

    }
}
