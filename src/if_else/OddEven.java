package if_else;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enetr Number:");
        int n = sb.nextInt();
        if (n % 2 == 0) System.out.println("Even Number");
        else System.out.println("Odd Number");
    }
}