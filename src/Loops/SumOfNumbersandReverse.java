package Loops;

import java.util.Scanner;

public class SumOfNumbersandReverse {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        int sum = 0;
        int reverse = 0;
        while(n!=0){
            int digit = (n%10);
            sum += digit;
            reverse = reverse * 10+digit;
            n/=10;
        }
        System.out.println("Sum : "+sum);
        System.out.println("Reverse : "+reverse);

    }
}
