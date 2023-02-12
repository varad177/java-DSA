import java.util.Scanner;

//addition of two matrix

public class array_2d_problems_1 {
    static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int a[][], int r1, int c1, int[][] b, int r2, int c2) {

        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printarr(sum);
    }

    static void check_validity(int r1, int c1, int r2, int c2) {
        if ((r1 != r2) || (c1 != c2)) {
            System.out.println("addition not possible");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first matrix rows and columns");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("enter the second matrix rows and columns");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        check_validity(r1, c1, r2, c2);

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        System.out.println("enter the " + c1 * r1 + " values for matrix 1");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the " + c2 * r2 + " values for matrix 2");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        add(a, r1, c1, b, r2, c2);
    }

}
