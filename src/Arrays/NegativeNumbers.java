package Arrays;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sb.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sb.nextInt();

        //Printing negative values
        for(int i=0; i<n; i++)
           if(arr[i]<0) System.out.print(arr[i]+" ");
    }
}
