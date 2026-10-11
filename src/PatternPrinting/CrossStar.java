package PatternPrinting;

import java.util.Scanner;

public class CrossStar {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int m = sb.nextInt();
        int n = sb.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i == j || i+j == n+1)
                    System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}