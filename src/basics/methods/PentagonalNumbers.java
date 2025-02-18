package basics.methods;

public class PentagonalNumbers {
    public static int getPentagonalNumber(int num) {
        return (num * (3 * num - 1)) / 2;
    }
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i <= 50; i++) {
            System.out.printf("%-6d", getPentagonalNumber(i));
            if (count % 10 == 0) System.out.println();
            count++;
        }
    }
}
