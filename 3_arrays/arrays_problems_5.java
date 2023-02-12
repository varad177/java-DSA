class amuu {
    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // calculatin total sum of array elements
    static int totalsum(int[] arr) {
        int n = arr.length;
        int totalsum = 0;
        for (int i = 0; i < n; i++) {
            totalsum = totalsum + arr[i];

        }
        return totalsum;

    }

    // check if we can partition the array into two subarraywith equal
    // sum. more formally, chech that prefix sum of a part of the array is equl to
    // the
    // suffix sum of rest of the array
    static void partition_for_equal_array(int[] arr) {

        System.out.println("partition_for_equal_array");

        int n = arr.length;
        int totalsum = totalsum(arr);
        int prefsum = 0;
        for (int i = 0; i < n; i++) {
            prefsum = prefsum + arr[i];
            int suffixsum = totalsum - prefsum;
            if (suffixsum == prefsum) {
                System.out.println("true");
            }

        }
        

    }

    void amuuu() {
        int[] a = { 1, 1, 1, 1, 1, 1 };
        partition_for_equal_array(a);

    }
}

public class arrays_problems_5 {
    public static void main(String[] args) {
        amuu ab = new amuu();
        ab.amuuu();

    }

}
