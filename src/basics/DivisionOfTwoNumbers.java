package basics;

import java.util.Scanner;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate their Div: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        double div = num1 / num2;
        System.out.println("The div is: " + div);
    }
}
