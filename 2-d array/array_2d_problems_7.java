import java.util.Scanner;

public class array_2d_problems_7 {
    static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // given a positive integer n, generate an n x n matrix filled with element form
    // 1 to nraised to 2 in spiral order
    static void spiral_to_matrix(int n) {
        int[][] matrix = new int[n][n];

        int toprow = 0;
        int bottomrow = n - 1;
        int leftcolumn = 0;
        int rightcolumn = n - 1;
        int current = 1;
        while (current <= n * n) {
            // print top row --> left column to right column
            for (int j = leftcolumn; j <= rightcolumn && current <= n * n; j++) {
                matrix[toprow][j] = current;
                current++;
            }
            toprow++;
            // print right column -->toprow to bottomrow
            for (int i = toprow; i <= bottomrow && current <= n * n; i++) {
                matrix[i][rightcolumn] = current;
                current++;
            }
            rightcolumn--;

            // print bottom row-->rightcolumn to leftcolumn
            for (int j = rightcolumn; j >= leftcolumn && current <= n * n; j--) {
                matrix[bottomrow][j] = current;
                current++;
            }
            bottomrow--;

            // print left column-->bottomrow to toprow
            for (int i = bottomrow; i >= toprow && current <= n * n; i--) {
                matrix[i][leftcolumn] = current;
                current++;
            }
            leftcolumn++;

        }
        printarr(matrix);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        spiral_to_matrix(n);

    }

}
