package Basics;

import java.util.Scanner;

public class SquareOfNumber {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter Value: ");
       int x = sc.nextInt();
       System.out.print("Square is: ");
       System.out.println(x*x);
   }
}
