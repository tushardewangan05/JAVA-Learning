package Loops;

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        for(int i=1; i<=n; i++){
            if(i%n==0) System.out.println(i);
            System.out.println(n/i);
        }
    }
}
