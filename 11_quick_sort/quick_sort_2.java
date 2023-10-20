public class quick_sort_2 {

    static void qs(int[] arr, int lb, int ub) {
        if (lb >= ub)
            return;
        int pi = partition(arr, lb, ub);
        qs(arr, lb, pi - 1);
        qs(arr, pi + 1, ub);

    }

    static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int cnt = 0;
        for (int i = lb + 1; i <= ub; i++) {
            if (arr[i] <= pivot) {
                cnt++;
            }

        }
        int pvtindx = lb + cnt;
        swap(arr, lb, pvtindx);

        int i = lb;
        int j = ub;
        while (i < pvtindx && j > pvtindx) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i < pvtindx && j > pvtindx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pvtindx;
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = arr[x];

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
        int arr[] = { 6, 3, 1, 5, 4 };

        System.out.println("main array");
        printarr(arr);

        System.out.println("sorted arrays");
        qs(arr, 0, arr.length);
        printarr(arr);

    }
}
