package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sb= new Scanner(System.in);
        int n = sb.nextInt();
        int r = 0;
        while(n!=0){
            r *= 10;
            r += (n%10);
            n /= 10;
        }
        System.out.println(r);
    }
}
