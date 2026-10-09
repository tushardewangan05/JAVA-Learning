package PatternPrinting;

import java.util.Scanner;

public class FirstPattren {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int row = sb.nextInt();
        int col = sb.nextInt();

        for(int i=1; i<=row; i++) {
            for (int j=1; j<=col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
