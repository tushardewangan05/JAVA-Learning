package Basics;

public class ModulusOperator {
    public static void main(String[] args) {

        // +,-,*,/,%
        //%

        int a = 11;
        int b = 10;
        int c = a%b;
        System.out.println(c);

        // Properties of Modulus
        //1. if a<b = a
        int d = 10;
        int e = 20;
        System.out.println(d%e);

        //2. if a%(-b) = a%b
        int f = 5;
        int g = -2;
        System.out.println(f%g);

        //3. If (-a)%b = -(a%b)
        int h = -15;
        int i = 6;
        System.out.println(h%i);
    }
}
