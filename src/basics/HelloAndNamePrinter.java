package Basics;

import java.util.Scanner;

public class HelloAndNamePrinter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");

        String fname = input.next();

        System.out.println();

        System.out.println("Enter your last name: ");

        String lname = input.next();

        System.out.println();

        System.out.println("Hello \n" + fname + " " + lname);

    }
}
