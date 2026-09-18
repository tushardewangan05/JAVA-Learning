package if_else;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();
        if(n % 5 == 0) System.out.println("True");
        else System.out.println("False");
    }
}