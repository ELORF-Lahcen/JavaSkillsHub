package data_structures.array;

import java.util.Scanner;

public class PrintAGridOfCharachters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n########################### Print A Grid Of Characters ###########################");

        System.out.print("\nEnter the character : ");
        String character = input.next();

        System.out.print("Enter number of lines in the grid : ");
        int nbrLines = input.nextInt();

        System.out.print("Enter number of columns in the grid : ");
        int nbrCls = input.nextInt();

        System.out.println();

        for (int i = 0; i < nbrLines; i++) {
            for (int j = 0; j < nbrCls; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }

    }
}
