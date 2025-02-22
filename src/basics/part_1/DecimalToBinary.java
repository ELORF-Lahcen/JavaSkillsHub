package basics.part_1;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n################################ Decimal to Binary Converter ################################");
        System.out.println();

        int decimal, quot, i = 1, j;
        int bin_num[] = new int[100];

        System.out.print("Enter a decimal number : ");
        decimal = input.nextInt();

        quot = decimal;

        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }

        System.out.print("Binary number is : ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }

        System.out.println();

        /*
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary equivalent : " + binary);
         */

        input.close();
    }
}
