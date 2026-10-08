package Loops;

import java.util.Scanner;

public class PowerRaisedLoop {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int a = sb.nextInt();
        int b = sb.nextInt();
        int pow = 1;
        for(int i=1; i<=b; i++) {
            pow *= a;
        }
        System.out.println(a+" raised to the power "+b+" is "+pow);
    }
}
