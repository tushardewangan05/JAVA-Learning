package Loops;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        int count =0;
        while(n!=0){
            n/=10;
            count++;
            System.out.println();
        }
    }
}
