package if_else;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("First number: ");
        int x = sb.nextInt();
        System.out.print("Second number: ");
        int y = sb.nextInt();
        System.out.print("Third number: ");
        int z = sb.nextInt();

        if (x>=y && x>=z) System.out.println(x);
        else if(y>=x && y>=z) System.out.println(y);
        else System.out.println(z);
    }
}
