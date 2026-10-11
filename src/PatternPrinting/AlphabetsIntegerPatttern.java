package PatternPrinting;

import java.util.Scanner;

public class AlphabetsIntegerPatttern {
    public static void main(String[] args){
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (j+64) + " ");
                }
                else{
                        System.out.print(j+" ");
                    }
                }
            System.out.println();
        }
    }
}
