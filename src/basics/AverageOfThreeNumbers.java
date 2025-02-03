package basics;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Three numbers : ");
        System.out.print("num1 = ");
        double num1 = input.nextDouble();
        System.out.print("num2 = ");
        double num2 = input.nextDouble();
        System.out.print("num3 = ");
        double num3 = input.nextDouble();

        System.out.println("The average of '"+ num1 + "' , '" + num2 + "' ,and '" + num3 + "' is " + (num1+num2+num3) / 3);

    }
}
