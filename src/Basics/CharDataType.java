package Basics;

public class CharDataType {
    public static void main(String[] args){
        char amrit = 'a';
        System.out.println(amrit);

        char eva = 's';
        System.out.println(eva);

        //typecasting - ek data type se doosra data type conversion
        char ch = 'A';
        int x = ch; //impicit typecasting
        System.out.println(x);

        char piyush ='a';
        int y = (int)piyush;   // explicit typecasting
        System.out.println(y);

        char harsh = '3';
        System.out.println((int)harsh);
    }
}