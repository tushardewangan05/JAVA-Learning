package Arrays;

import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sb.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++){
            arr[i] = sb.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}
