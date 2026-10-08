package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        int sum = 0;
        while(n!=0){
            sum +=(n%10);
            n/=10;
        }
        System.out.println(sum);
    }
}
