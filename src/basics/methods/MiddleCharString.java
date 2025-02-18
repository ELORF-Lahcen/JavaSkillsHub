package basics.methods;

import java.util.Scanner;

public class MiddleCharString {
    public static void findMiddleCharacterString(String str) {
        int length = str.length();
        int middle = length/2;

        if (length % 2 == 0) {
            System.out.println("Middle characters are : " + str.charAt(middle-1) + str.charAt(middle));
        } else {
            System.out.println("Middle character is : " + str.charAt(middle));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n################################ Find Middle Character(s) of String ################################");

        System.out.print("Input a String : ");
        String str = input.next();

        findMiddleCharacterString(str);
        input.close();
    }
}
