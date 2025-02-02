package data_structures.array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageValueOfArray {
    public static double calculateAverageOfArray(int[] arr) {
        int sum = 0;

        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int length = input.nextInt();
        System.out.println();

        int[] nums = new int[length];
        for(int i=0; i < nums.length ; i++) {
            System.out.print("Nums[" + (i+1) +"] = " );
            nums[i] = input.nextInt();
        }

        System.out.println("\nThe array is : "+ Arrays.toString(nums));
        System.out.println("\nThe average of the array is : " + calculateAverageOfArray(nums));
    }
}
