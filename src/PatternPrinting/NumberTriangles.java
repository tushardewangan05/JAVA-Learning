package PatternPrinting;

import java.util.Scanner;

public class NumberTriangles {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                //System.out.print(i+" ");
//                System.out.print(j+" ");
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
