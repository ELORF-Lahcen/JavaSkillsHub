package basics.part_1;

import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("################################ Binary Multiplication ################################");
        System.out.println();

        System.out.print("Enter first binary number : ");
        String binary1 = input.nextLine();

        System.out.print("Enter second binary number : ");
        String binary2 = input.nextLine();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int res = num1 * num2;

        String binaryMul = Integer.toBinaryString(res);

        System.out.println("Multiplication of binary numbers : " + binaryMul);
    }
}
