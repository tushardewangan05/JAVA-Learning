package PatternPrinting;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("R ");
            }
            System.out.println();
        }
    }
}
