package basics.methods;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    /*public static int sumOfDigits(String numStr) {
        int sum = 0;

        for (char c : numStr.toCharArray()) {
            sum += c - '0';
        }

        return sum;
    }*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("################################ Sum of Digits in Integer ################################");
        System.out.print("Enter a Integer : ");
        int num = input.nextInt();
        //String numStr = input.nextLine();
        input.close();

        System.out.println("Number of words : " + sumOfDigits(num));
    }
}
