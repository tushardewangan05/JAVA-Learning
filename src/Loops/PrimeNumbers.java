package Loops;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        for(int i=2; i<=n; i++){
            System.out.println("Prime Number");
        }
    }
}