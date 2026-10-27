package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static int fact(int x) {
        int f = 1;
        for(int i=1; i<=x; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();
        int r = sb.nextInt();

//        int nFact = 1;
//        for(int i=1; i<=n; i++){
//            nFact *= i;
//        }
//        int rFact = 1;
//        for(int i=1; i<=r; i++){
//            rFact *= i;
//        }
//        int nrFact = 1;
//        for(int i=1; i<=n-r; i++){
//            nrFact *= i;
//        }
        int ncr = fact(n)/fact(r)*fact(n-r);
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr+" "+npr);
    }
}
