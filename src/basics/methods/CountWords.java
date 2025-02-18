package basics.methods;

import java.util.Scanner;

public class CountWords {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("################################ Count Words in String ################################");
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        input.close();

        System.out.println("Number of words : " + countWords(str));
    }
}
