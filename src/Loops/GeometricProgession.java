package Loops;

import java.util.Scanner;

public class GeometricProgession {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();

        int a = 1, r = 2;
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a *= r;
        }
    }
}