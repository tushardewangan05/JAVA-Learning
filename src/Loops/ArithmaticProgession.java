package Loops;


import java.util.Scanner;

public class ArithmaticProgession {
    public static void main(String[] args){
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();

//        for(int i=2; i<=3*n-1; i+=3){
//            System.out.print(i);

            //Without using formula
            int a = 3, d = 6;
             for(int i = 1; i<=n; i++){
                 a += d;
                 System.out.print(a+" ");
             }
        }
    }
