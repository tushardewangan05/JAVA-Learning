package Basics;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first number: ");
        int arpit=sc.nextInt();
        System.out.print("Enter second number: ");
        int shruti=sc.nextInt();
        System.out.print("Enter third number: ");
        int yashika=sc.nextInt();

        System.out.println(arpit+shruti+yashika);

    // Determine simple interest

        System.out.println("Enter principle amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");;
        double r = sc.nextDouble();
        System.out.println("Enter time: ");
        double t = sc.nextDouble();

        double si= p*r*t/100;
        System.out.println(si);

    }
}
