package Loops;

import java.util.Scanner;

public class CompositeFactors {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();
        for(int i=2; i<=n; i++){
            if(n%i==0) System.out.println("Composite Number");
        }
    }
}
