//some problems 

class varad {
    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int a, int b) {
        System.out.println("original value");
        System.out.println("a= " + a + ", b= " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("changed value");
        System.out.println("a= " + a + ", b= " + b);

    }

    static void swap_withouttemp(int a, int b) {
        System.out.println("original value");
        System.out.println("a= " + a + ", b= " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("changed value");
        System.out.println("a= " + a + ", b= " + b);
    }

    static void reverse_array(int arr[]) {
        System.out.println("the original array is ");
        printarr(arr);

        int n = arr.length;
        int[] ansarr = new int[n];
        // int j = 0;
        // /// traverse original array in reverse direction
        // for (int i = n - 1; i >= 0; i--) {
        // ansarr[j++] = arr[i];

        // }
        int i = n - 1, j = 0;
        while (i >= 0) {
            ansarr[j++] = arr[i--];

        }
        System.out.println("the reverse array is ");
        printarr(ansarr);
    }

    static void swaparrays(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverce_inplace(int[] arr) {
        System.out.println("original inplace arrays ");
        printarr(arr);
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            swaparrays(arr, i, j);
            i++;
            j--;

        }
        System.out.println("reverse inplace arrays");
        printarr(arr);

    }

    static void rotate_array(int arr[], int k) {
        System.out.println("the rotate array is ");
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        printarr(ans);
    }

    void n() {
        swap(2, 3);
        swap_withouttemp(2, 3);
        int[] age = { 1, 2, 3, 4, 5 };
        reverse_array(age);
        reverce_inplace(age);
        int[] ages = { 1, 2, 3, 4, 5 };
        rotate_array(ages, 6);

    }

}

public class arrays_problems_2 {
    public static void main(String[] args) {
        varad v = new varad();
        v.n();
    }

}
