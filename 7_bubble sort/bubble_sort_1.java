//it is basically used for sorting
//we do a ertain number of passes and in every pass we compare adjacent element and swap if they are not in order 
//in there is n numbers in array the it can be sort in n-1 passes

public class bubble_sort_1 {

    static void bubblesort(int[] a) {
        int n = a.length;
        // n-1 passes
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                // last i element aleardy sorted
                // no need to check them
                if (a[j] > a[j + 1]) {
                    // swap a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
                if (!flag) {
                    return;
                }
                // we have improve best case
                // so time complexity in best case is o(n)
            }
        }
        printarr(a);
    }

    static void printarr(int[] arr) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = { 7, 6, 5, 4, 3 };
        System.out.println("original array");
        printarr(a);
        System.out.println("sorted array");
        bubblesort(a);

    }
}

// time and space complixity
// we did not used extra space
// there for space = o(1)

// time complexuty
// o(n**2)

//bubble sort is stable sort
//bubble sort is in-place sort algorithm