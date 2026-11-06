package Arrays;

import java.util.Scanner;

public class MaximumOfArrays {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sb.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sb.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.print("max number: "+max);
    }
}
