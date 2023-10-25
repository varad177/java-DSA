public class d_4_search_in_sorted_arr {

    // oracle co,pony question

    // we will see mul approach
    // brute force approach -> in this we will see the and compare the all elements
    // so the complexity is n^2

    // row wise sorted so we appli the binary search
    // in this we will search the element in all the arrays of the 2d arrays
    // so we get the log n complexity for the arrys in 2d arrays
    /// there for total complexty is the n log n


    //complexity 
    //id the rows are more then 
    // then the TC is O(n)

    //if the col are more 
    // then the Tc is o(m)

    // but the following TC is o(n+m)

    public static boolean stairCaseSearch(int arr[][], int key) {

        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {

            if (arr[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;

            } else if (key < arr[row][col]) {

                col--;

            } else {
                row++;
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
        int key = 10;

        print_mul_arr(matrix);
        stairCaseSearch(matrix, key);
    }
}
