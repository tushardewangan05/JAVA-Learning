package Basics;

public class PatternPrint{
    public static void main(String[] args) {
        int n=5;
        //for upper
                for(int i = 0; i < n; i++){
                    //Spaces print
                    for(int j = 0; j < i; j++){
                        System.out.print(" ");
                    }
                    for(int j = 0; j < 2*(n-i)-1; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
        //for lower
                for(int i = 1; i < n-1; i++){
                    for(int j = 0; j<i+1; j++){
                        System.out.print(" ");
                    }
                    for(int j = i+1; j < 2*n-1; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
    }
}
