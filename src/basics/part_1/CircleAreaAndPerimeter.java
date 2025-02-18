package basics.part_1;

import java.util.Locale;
import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Entre the radius : ");
        double rad = input.nextDouble();

        System.out.println("\nPerimeter is = " + 2 * Math.PI * rad);
        System.out.println("Area is = " + Math.PI * Math.pow(rad, 2));

        input.close();
    }
}
