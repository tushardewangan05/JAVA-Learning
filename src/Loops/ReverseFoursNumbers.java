package Loops;

import java.util.Scanner;

public class ReverseFoursNumbers {
    static void main(String[] args) {
        int count = 0;
        for(int i=99; i>0; i-=4) {
            System.out.print(i + " ");
            count++;
        }
            System.out.print("\nTotal Numbers= "+count);
    }
}