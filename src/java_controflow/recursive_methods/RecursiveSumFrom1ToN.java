package java_controflow.recursive_methods;

import java.util.Scanner;

public class RecursiveSumFrom1ToN {

    public static long sumFrom1ToN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumFrom1ToN(n - 1);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int num = input.nextInt();

        System.out.println("Sum of " + num + " to 1 is : " + sumFrom1ToN(num));
    }
}
