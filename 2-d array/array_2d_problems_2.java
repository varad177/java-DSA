import java.util.Scanner;

//multiplication of two matrix

public class array_2d_problems_2 {
    static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplication_matrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                // tisra loop bhi lagaya q ki hame addition bhi perform karna hai
                for (int k = 0; k < c1; k++) {
                    mul[i][j] = mul[i][j] + (a[i][k] * b[k][j]);
                }

            }

        }
        printarr(mul);

    }

    static void check_validity(int c1, int r2) {
        if (c1 != r2) {
            System.out.println("multiplication not possible");
            return;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of first matrix rows and columns");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("enter the number of second matrix rows and columns");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];

        // checking the matrix is valid or not for multiplication
        check_validity(c2, r1);

        
        System.out.println("enter the value in first matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the value in second matrix");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        multiplication_matrix(a, r1, c1, b, r2, c2);

    }

}
