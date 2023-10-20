//by recursion
//recursive binary search 

public class binary_search_2 {

    static boolean BinarySearch(int[] arr, int Target, int st, int end) {

        while (st > end)
            return false;
        int mid = (st + end) / 2;
        if (Target == arr[mid]) {
            return true;
        } else {
            if (Target < arr[mid]) {
                end = mid - 1;
                return BinarySearch(arr, Target, st, end);

            } else {
                st = mid + 1;
                return BinarySearch(arr, Target, st, end);

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int Target = 3;
        int n = arr.length;
        int st = 0;
        int end = n - 1;

        if (BinarySearch(arr, Target, st, end) == true) {
            System.out.println("element is present in array");
        } else {
            System.out.println("element is not present in array ");
        }

    }

}
