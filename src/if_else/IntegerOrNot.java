package if_else;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = sb.nextDouble(); //n = 1, n = 1.5
        int x = (int) n; // x = 1
        if (n - x == 0) System.out.println("Is an integer");
        else System.out.println("Is not an integer");
    }
}