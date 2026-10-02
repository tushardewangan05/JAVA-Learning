package Loops;

import java.util.Scanner;

public class ReverseNumberOfFour {
    static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();

        for(int i=99; i<=-n; i--){
            System.out.println(i+" ");
        }
    }
}
