package basics.part_1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre a number : ");
        int num = input.nextInt();

        System.out.println("\n########################## Multiplication Table of " + num + " ##########################\n");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
