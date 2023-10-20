//rsdix sort is non comparision based algo 
// it is like digit by digit sorting 
//it is stable algo
//in this we just make the count array of size  10 

public class radix_sort_1 {

    static void radix_sort(int[] arr) {
        int max = findmax(arr);
        // apply counting sort to sort elements based on placed value

        for (int place = 1; max / place > 0; place *= 10) {
            countsort(arr, place);
        }
    }

    static void countsort(int[] arr, int place) {

        int n = arr.length;
        int[] output = new int[n];

        // find the largest element

        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / place) % 10]++;
        }

        // making prefix sum array

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];

        }

        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        // copy all elements
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    // /array printing

    static void printarr(int[] arr) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("]");
        System.out.println();
    }

    // finding max
    static int findmax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        int[] arr = { 43, 433, 626, 894, 0, 3 };
        System.out.println("original array ");
        printarr(arr);
        radix_sort(arr);
        System.out.println("sorted array");
        printarr(arr);

    }
}