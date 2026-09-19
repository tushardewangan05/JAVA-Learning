package if_else;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();

        if(n>999 && n<10000) System.out.println("Four Digit Number");
        else System.out.println("Not a four digit mumber");
    }
}
