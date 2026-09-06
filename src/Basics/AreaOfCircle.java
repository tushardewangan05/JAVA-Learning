package Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfCircle{
    static void main() {
        //Area of circle? pi*r*r
//        int r = 9;
//        System.out.println(3.141592 * r * r);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
    }
}
