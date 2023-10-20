class quick_sort_1 {

    static int partition(int arr[], int ub, int lb) {
        int pi = arr[lb];
        int i = lb;
        int j = ub;

        while (i < j) {
            while (arr[i] <= pi) {
                i++;
            }

            while (arr[j] > pi) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        if (i > j) {
            arr[lb] = arr[j];
            arr[j] = pi;

        }
        return j;

    }

    static void quick_sort(int arr[], int ub, int lb) {
        if (lb < ub) {

            int pi = partition(arr, ub, lb);
            quick_sort(arr, lb, pi - 1);
            quick_sort(arr, pi + 1, ub);
        }
    }

    static void printarr(int arr[]) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 3, 98, 45, 90, 22, 67 };
        System.out.println("original arr");
        printarr(arr);
        int lb = 0;
        int ub = arr.length;
        quick_sort(arr, ub, lb);
        System.out.println("sorted arr is ");
        printarr(arr);

    }
}
