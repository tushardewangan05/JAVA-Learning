package Loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
