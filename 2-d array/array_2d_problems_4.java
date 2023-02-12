import java.util.Scanner;

// rotating matrix in 90 deg

public class array_2d_problems_4 {

    static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeinplace(int[][] arr, int r, int c) {

        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                // swap matrix
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }

    }

    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            int t= arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }

    }

    static void rotatematrix(int[][] matrix, int n) {
        // transpose
        // reverse each row of transpose array
        transposeinplace(matrix, n, n);

        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }

    }

    public static void main(String[] args) {
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
        System.out.println("original array is ");
        printarr(matrix);

        rotatematrix(matrix, c);
        System.out.println("the rotation matrix is ");
        printarr(matrix);

    }

}
