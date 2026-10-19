package PatternPrinting;

import java.util.Scanner;

public class BridgePattern {
    public static void main(String[] args) {
        Scanner sb =  new Scanner(System.in);
        int n = sb.nextInt();
        int nsp = 1;
        for(int i=1; i<=2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*"+" ");
            }
                for(int j=1; j<=nsp; j++){
                    System.out.print(" "+" ");
                }
                for(int j=1; j<=n-i; j++){
                    System.out.print("*"+" ");
                }
                nsp += 2;
                System.out.println();
            }
        }
    }