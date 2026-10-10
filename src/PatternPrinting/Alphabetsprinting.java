package PatternPrinting;

import java.util.Scanner;

public class Alphabetsprinting {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
