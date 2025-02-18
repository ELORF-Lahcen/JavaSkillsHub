package basics.methods;

import java.util.Scanner;

public class CountVowels {
    /* public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        String vowels = "aeiou";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }*/

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'o' || str.charAt(i) == 'i') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("################################ Count Vowels in String ################################");
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        input.close();

        System.out.println("Number of vowels : " + countVowels(str));
    }
}
