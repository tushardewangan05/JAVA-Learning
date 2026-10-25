package Methods;

import java.util.Scanner;

public class MaxOfFourBuiltIn {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter the number; ");
        int a = sb.nextInt();
        int b = sb.nextInt();
        int c = sb.nextInt();
        int d = sb.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}