package java_controflow.recursive_methods;

import java.util.Scanner;

public class RecursiveFactorialCalculation {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        System.out.println("\nFactorial of " + num + " is " + factorial(num));
    }
}
