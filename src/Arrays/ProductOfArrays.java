package Arrays;

import java.util.Scanner;

public class ProductOfArrays {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sb.nextInt();
       int[] arr = new int[n];
       int product = 1;

       for(int i=0; i<n; i++){
           arr[i] = sb.nextInt();
           product *= arr[i];
       }
        System.out.print("Product: "+product);
    }
}
