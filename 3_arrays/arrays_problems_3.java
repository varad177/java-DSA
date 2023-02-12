class amu {

    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // sort an array consisting only 0 & 1;
    static void sort_zero_one_array(int[] arr) {
        System.out.println("sort by single pointer");
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }

        }
        for (int j = 0; j < n; j++) {
            if (j < count) {
                arr[j] = 0;
            } else {
                arr[j] = 1;
            }

        }
        printarr(arr);
    }

    // sort an array consisting only 0 & 1 by two pointer
    static void sort_zero_one_array_by_two_pointer(int[] arr) {
        System.out.println("sort by two pointer");
        int t;
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;

            }
            left++;
            right--;
        }
        printarr(arr);
    }

    // given an array of integer a; move all the even integer at the
    // beginning of the array followed by all the odd integers the
    // relative order pf odd pr even integers does not matter .
    // return any arrys thet satisfy the condition
    static void even_first_odd_last(int[] arr) {
        System.out.println("even_first_odd_last");
        int n = arr.length;
        int left = 0;

        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                int t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;
                left++;
                right--;

            }
            if (arr[left] % 2 == 0) {
                left++;

            }
            if (arr[right] % 1 == 0) {
                right--;

            }

        }
        printarr(arr);

    }

    // given an ainteger array a sorte in non-decresing order
    // return an array of the squares ofeach numbersorted in non-decresing order
    static void sortsquares(int arr[]) {
        System.out.println("sort squares");
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        int k = n-1;
        while (left <= right) {
            if ((Math.abs(arr[left])) > (Math.abs(arr[right]))) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }

        }
        printarr(ans);

    }

    void amruta() {
        int[] num = { 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1 };
        int[] nums = { 1, 0, 0, 1, 0, 1, 1, 0 };
        sort_zero_one_array(num);
        sort_zero_one_array_by_two_pointer(nums);
        sort_zero_one_array_by_two_pointer(num);
        int[] even_odd = { 1, 2, 3, 4, 5 };
        even_first_odd_last(even_odd);
        int[] evens_odd = { 1, 5, 4, 6, 3, 2, 8 };
        even_first_odd_last(evens_odd);
        int[] squares = { -10, -5, -2, 1, 4, 9 };
        sortsquares(squares);

    }
}

public class arrays_problems_3 {
    public static void main(String[] args) {
        amu a = new amu();
        a.amruta();

    }

}
