import java.util.Scanner;

//spiral order traversal
//general matrix in spiral order

public class array_2d_problems_6 {
    static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // given a matrix are of order n
    // return the elements in spiral order
    static void spiral_order(int[][] matrix, int r, int c) {
        int toprow = 0;
        int bottomrow = r - 1;
        int leftcolumn = 0;
        int rightcolumn = c - 1;
        int totalelements = 0;
        while (totalelements < r * c) {
            // print top row --> left column to right column
            for (int j = leftcolumn; j <= rightcolumn && totalelements < r * c; j++) {
                System.out.print(matrix[toprow][j] + "-->");
                totalelements++;
            }
            toprow++;
            // print right column -->toprow to bottomrow
            for (int i = toprow; i <= bottomrow && totalelements < r * c; i++) {
                System.out.print(matrix[i][rightcolumn] + "-->");
                totalelements++;
            }
            rightcolumn--;

            // print bottom row-->rightcolumn to leftcolumn
            for (int j = rightcolumn; j >= leftcolumn && totalelements < r * c; j--) {
                System.out.print(matrix[bottomrow][j] + "-->");
                totalelements++;
            }
            bottomrow--;

            // print left column-->bottomrow to toprow
            for (int i = bottomrow; i >= toprow && totalelements < r * c; i--) {
                System.out.print(matrix[i][leftcolumn] + "-->");
                totalelements++;
            }
            leftcolumn++;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of r and c: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("enter " + r * c + " elements");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();

        }

        System.out.println("original matrix is:");
        printarr(matrix);

        System.out.println("spiral elements are-->");
        spiral_order(matrix, r, c);

    }

}
