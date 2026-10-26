package Loops;

import java.util.Scanner;

public class CompositeFactors {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();
        boolean flag = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (n == 1) System.out.println("Neither prime nor composite");
        else if(flag == false) System.out.println("Composite Number");
        else System.out.println("Prime Number");
    }
}