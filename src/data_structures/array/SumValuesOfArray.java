package data_structures.array;

import java.util.Scanner;

public class SumValuesOfArray {

    public static long sumValuesOfArray(int[] arr) {
        long res = 0;
        for (int i=0; i < arr.length; i++) {
            res = res + arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the Array : ");
        int lengthOfArr = input.nextInt();
        System.out.println();

        int[] arr = new int[lengthOfArr];

        for (int i=0; i < arr.length; i++) {
            System.out.print("Nums[" + (i+1) +"] = " );
            arr[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("Sum Values of the Array is : " + sumValuesOfArray(arr));

        input.close();
    }
}
