package if_else;

import java.util.Scanner;

public class QuadrantLies {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sb.nextInt();
        System.out.print("Enter y: ");
        int y = sb.nextInt();

        if (x > 0 && y > 0) System.out.println("1st Quadrant");
        else if(x < 0 && y > 0) System.out.println("2nd Quadrant");
        else if(x < 0 && y < 0) System.out.println("3rd Quadrant");
        else if (x > 0 && y < 0) System.out.println("4th Quadrant");
        else if (x == 0 && y == 0) System.out.println("Origin");
        else if(y == 0) System.out.println("x axis");
        else
            System.out.println("y axis");
    }
}
