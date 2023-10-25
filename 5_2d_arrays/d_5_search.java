public class d_5_search {

    public static boolean stairCaseSearch(int arr[][], int key) {

        int row = arr.length -1;
        int col =0;

        while (row < arr.length && col >= 0) {

            if (arr[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;

            } else if (key < arr[row][col]) {

               row--;

            } else {
               col++;
            }
        }
        System.out.println("key is not found");
        return false;

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

        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 50;

        print_mul_arr(matrix);
        stairCaseSearch(matrix, key);
    }
}
