package data_structures.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {

    public static void sortNumericArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(array));
    }

    public static void sortStringArray(String[] array) {
        Arrays.sort(array);
        System.out.println("Sorted String Array: " + Arrays.toString(array));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the type of the Array : \n1- Numeric Array\n2- String Array");
        int type = input.nextInt();

        if (type == 1) {
            System.out.print("Enter the length of the Array of numbers : ");
            int lengthOfArrayNum = input.nextInt();
            System.out.println();

            int[] nums = new int[lengthOfArrayNum];
            for(int i=0; i < nums.length ; i++) {
                System.out.print("Nums[" + (i+1) +"] = " );
                nums[i] = input.nextInt();
            }
            System.out.println();
            sortNumericArray(nums);
        }else if (type == 2) {
            System.out.print("Enter the length of the Array of Strings : ");
            int lengthOfArrayStr = input.nextInt();
            System.out.println();

            String[] Strs = new String[lengthOfArrayStr];
            for(int i=0; i < Strs.length ; i++) {
                System.out.print("Strs[" + (i+1) +"] = " );
                Strs[i] = input.next();
            }
            System.out.println();
            sortStringArray(Strs);
        }else {
            System.out.println("\nThere is 2 choices 1 or 2");
        }
    }
}
