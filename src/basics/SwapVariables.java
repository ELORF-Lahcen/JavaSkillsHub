package basics;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("\n############################### Swap Variables ###############################\n");

        System.out.println("========= Before Swapping =========");

        System.out.print("Enter the first Integer : ");
        num1 = input.nextInt();

        System.out.print("Enter the second Integer : ");
        num2 = input.nextInt();

        System.out.println("You enter this numbers: \nnum1 = " + num1 + "\nnum2 = "+num2);

        num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("\n========= After Swapping =========\n");

        System.out.println("This is the numbers after swapping : \nnum1 = " + num1 + "\nnum2 = "+num2);


    }
}
