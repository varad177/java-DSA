public class d_3_digonal_sum {

    public static void digibal_sum(int arr[][]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
            }
        }

        System.out.println("the sum is " + sum);

    }

    public static void print_mul_arr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        print_mul_arr(matrix);

        digibal_sum(matrix);

    }
}
