package Loops;

import java.util.Scanner;

public class SequencePrint {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        int a=0;

        for(int i=1; i<=n; i++){
            System.out.println(i+" ");
            System.out.println(n-a++);

        }
    }
}
