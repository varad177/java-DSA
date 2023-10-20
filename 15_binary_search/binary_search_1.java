//it is a searching algo
//by which we can search the element from the given arrays 

public class binary_search_1 {

    static void BinarySearch(int[] arr, int Target) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (Target == arr[mid]) {
                System.out.println("the element is present at " + (mid +1) + " location");
                return;
            } else {
                if (Target < arr[mid]) {
                    end = mid - 1;

                } else {
                    st = mid + 1;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int Target = 1;
        BinarySearch(arr, Target);

        // if (BinarySearch(arr, Target) == true) {
        // System.out.println("element is present in array");
        // } else {
        // System.out.println("element is not present in array ");
        // }

    }
}
