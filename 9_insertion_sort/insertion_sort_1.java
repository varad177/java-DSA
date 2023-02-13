//take one element from unsorted part , iterate through the
// sorted part and find the correct position of this element

public class insertion_sort_1 {

    static void insertion_sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
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
        int[] a = { 8, 3, 6, 5, 4, 2 };
        System.out.println("the original array is: ");
        printarr(a);
        System.out.println("the sorted array is :");
        insertion_sort(a);

    }
}

/// time complexity
// best case o(n)
// worst case o(n**2)
// inplace algorithm
// it is stable algorithm
