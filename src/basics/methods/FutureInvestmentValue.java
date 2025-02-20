package basics.methods;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static double futureInvestmentValue(double principal, double annualRate, int years) {
        int monthsPerYear = 12;
        double monthlyRate = annualRate / 100 / monthsPerYear;
        int totalMonths = years * monthsPerYear;

        return principal * Math.pow(1 + monthlyRate, totalMonths);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n################################ Find the smallest number among three numbers ################################");

        System.out.print("Enter the initial investment amount : ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate in percentage : ");
        double annualRate = input.nextDouble();

        System.out.print("Enter the number of years : ");
        int years = input.nextInt();

        System.out.println("\nYears    Future Value");
        for (int i = 1; i <= years; i++) {
            double futureValue = futureInvestmentValue(principal, annualRate, i);
            System.out.printf("%-8d %.2f%n", i, futureValue);
        }
    }
}
