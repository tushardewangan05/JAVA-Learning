package if_else;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sb.nextInt();
        System.out.print("Enter Breadth: ");
        int b = sb.nextInt();

        int area = l*b;
        int perimeter = 2*(l+b);

        if(area>perimeter) System.out.println("Area is Greater than perimeter");
        else System.out.println("Not greater");
    }
}
