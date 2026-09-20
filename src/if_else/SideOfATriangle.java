package if_else;

import java.util.Scanner;

public class SideOfATriangle {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = sb.nextInt();
        System.out.print("Enter second side: ");
        int b = sb.nextInt();
        System.out.print("Enter third side: ");
        int c = sb.nextInt();

        if (a + b > c && b + c > a && a + c > b) System.out.println("Valid Triangle");
        else System.out.println("Invalid Triangle");
    }
}
