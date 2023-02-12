import java.util.Scanner;

//prefix sum in  2d array

//we will do it by
//1- sum rectangle using brute force method
//2- sum rectangle using pre-calcilating the horizontal sum for erach row
//3- sum rectangle using pre fix sum over both rows and columns

public class array_2d_problems_8 {
    static void printarr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // given a matrix 'a' of dimension n x m and 2 coordinate (l1, r1) and (l2, r2)
    // .
    // return the sum of the rectangle from (l1, r1) to (l2,r2)
    // point 1- l2>=l1 , r2>=r1;
    // point 2- 0<= l1,l2,n;
    // point 3- 0<= r1,r2,m;
    static void findsum(int[][] arr, int l1, int l2, int r1, int r2) {
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum = sum + arr[i][j];

            }
        }
        System.out.println("the normal sum is " + sum);

    }

    static void findprefixsum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        // travers horizontally to calculate riw wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i][j - 1];

            }
        }
       

    }

    // calculatingg row and column wise
    static void findprefixsumvertically(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        // travers horizontally to calculate riw wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] = matrix[i][j] + matrix[i][j - 1];

            }
        }
     

        // travers vertically to calculate column wise sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] = matrix[i][j] + matrix[i - 1][j];
            }
        }
       

    }

    // methos-2
    // pre-calculating the horizontal sum for rach row in the matrix
    static void findsum2(int[][] matrix, int l1, int l2, int r1, int r2) {
        int sum1 = 0;
        findprefixsum(matrix);
        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum for row i
            if (r1 >= 1) {
                sum1 += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum1 += matrix[i][r2];
            }
        }
        System.out.println("sum by prefix sum " + sum1);

    }

    static void findsum3(int[][] matrix, int l1, int l2, int r1, int r2) {
        int ans = 0;
        int up = 0, left = 0, leftup = 0;

        findprefixsumvertically(matrix);

        int sum2 = matrix[l2][r2];
        if (l1 >= 1)
            up = matrix[l1 - 1][r2];
        if (r1 >= 1)
            left = matrix[l2][r1 - 1];
        if ((l1 >= 1) && (r1 >= 1)) {
            leftup = matrix[l1 - 1][r1 - 1];
        }

        ans = sum2 - up - left + leftup;

        System.out.println("sum by vertically prefix " + ans);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("enter " + r * c + " numbers");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = 1;
            }
        }
        System.out.println("original matrix");
        printarr(matrix);
       
        System.out.println();
        findprefixsumvertically(matrix);


        System.out.println("enter the value of l1 & r1");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.println("enter the value of l2 & r2");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

      
        findsum(matrix, l1, l2, r1, r2);
        findsum2(matrix, l1, l2, r1, r2);
        findsum3(matrix, l1, l2, r1, r2);

    }

}
