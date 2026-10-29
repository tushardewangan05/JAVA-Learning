package Arrays;

import java.util.Scanner;

public class OutputInputArrays {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int [] arr = {1,3,5,6,4,7,9,2,6,4,1};
//        int n = arr.length;
//        for(int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }

        //Default values
        int[] karan = new int[7];
        for(int i=0; i<7; i++){
//            System.out.print(karan[i]+" ");
        }
//        input
        for(int i=0; i<7; i++){
            int x = sb.nextInt();
            karan[i] = x;
        }
        for(int i=0; i<7; i++){
            System.out.print(karan[i]+" ");
        }
    }
}