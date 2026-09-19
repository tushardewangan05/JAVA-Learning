package if_else;

import java.util.Scanner;

public class MagnitudeSmaller {
    public static void main(String[] args) {
        Scanner sb =  new Scanner(System.in);
        System.out.print("Ente NUmber: ");
        int n = sb.nextInt();

        if(n>=-69 && n<69) System.out.println("Magnitude is less than 69 = "+Math.abs(n));
        else System.out.println("Magnitude is not less than 69");
    }
}