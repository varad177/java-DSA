import java.security.Signature;
import java.util.Scanner;

// given an integer n, return the first n row of pascal's triangle.
//in pascal's triangle , each number is the sum of the two numbers directly above it as shown

public class array_2d_problems_5 {

    static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void pascals(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            // ith row has i+1 columns
            ans[i] = new int[i + 1];
            // yaha par hamne manually ith jagah par ek array banaya
            // now 1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];

            }
        }
        printarr(ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the n: ");
        int n = sc.nextInt();
           pascals(n);
    }

}
