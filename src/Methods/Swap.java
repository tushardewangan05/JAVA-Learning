package Methods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int a = sb.nextInt();
        int b = sb.nextInt();
        System.out.println(a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}