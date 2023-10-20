// do 0 5 0 3 42
// like 5 3 42 0 0
//so we have to use bubble sort
// because we need to place the zero at last 
//given an integer array arr, move all zoro to the end 

public class sorting_ques_1 {

    static void zeroatend(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarr(arr);
    }

    static void printarr(int[] arr) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 10, 5, 0, 4 };
        System.out.println("the original array ");
        printarr(a);
        System.out.println("the ans array is ");
        zeroatend(a);

    }

}