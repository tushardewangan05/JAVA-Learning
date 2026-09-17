package if_else;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enetr Number:");
        int n = sb.nextInt();
        if(n%2 ==0) System.out.println("Odd Number");
        else System.out.println("Even Number");
    }
}
