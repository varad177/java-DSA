import java.util.Scanner;

//transpose of matrix
//rotation of matrix
//pascal's triangle

public class array_2d_problems_3 {
    static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose(int[][] arr, int r, int c) {
        System.out.println("original array is ");
        printarr(arr);
        System.out.println("transpose array is ");
        // ans array ka size ulta ho jyata hai
        // point to be noted
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];

            }
        }

        printarr(ans);
    }

    static void transposeinplace(int[][] arr, int r, int c) {
        //only squar matrix ka nikal skte hai transpose
        System.out.println("the transpose by inplace");
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                // swap matrix
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;

            }
        }
        printarr(arr);

    }

    public static void main(String[] args) {
        // int[][] matrix = {{1,2,9},{3,4,5},{6,7,8}};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        int r = sc.nextInt();
        System.out.println("enter the number of column");
        int c = sc.nextInt();
        System.out.println("enter " + r * c + " elements ");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();

        }
        transpose(matrix, r, c);
        transposeinplace(matrix, r, c);
       
    }
}
