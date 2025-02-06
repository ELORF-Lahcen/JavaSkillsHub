package basics;

import java.util.Locale;
import java.util.Scanner;

public class RectangleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("\n############################### Rectangle Area And Perimeter ###############################\n");

        System.out.println("Enter the width and Height of the rectangle :");

        System.out.print("Width = ");
        double width = input.nextDouble();

        System.out.print("Height = ");
        double height = input.nextDouble();

        System.out.println("\nThe Area is : " + (width * height));
        System.out.println("The Perimeter is : " + (2 * (width+height)));
    }
}
