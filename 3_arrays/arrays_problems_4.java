// import java.util.Scanner;

class ankita {
    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // given integer array 'a'. return the prefix sum/running sum in
    // the same array without creating a new array

    static void prefix_sum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        printarr(arr);
    }

    // given an array of integer pf size n. Answer q queries where you need to print
    // the
    // sum of value in a given range of indices from 'l' to 'r'
    // (both included)
    // NOTE : The value of l and r in queries follow 1- based indexing
    // is ques mw hame perticular range mese sum find karna hai
    static void queries_range_sum(int[] arr, int l, int r) {
        // int n = arr.length;
        // for (int i = 1; i < n; i++) {
        //     arr[i] = arr[i - 1] + arr[i];
        // }
        // int sum = arr[r] - arr[l - 1];
        // System.out.println("the sum is " + sum);

    }

    void ankitaa() {
        int[] num = { 1, 2, 3, 4, 5, 6 };
          prefix_sum(num);
        // int[] v = new int[6];
        // System.out.println("enter arr elements");
        // Scanner sc = new Scanner(System.in);
        // for (int i = 1; i < v.length; i++) {
        //     v[i] = sc.nextInt();
        // }
        // System.out.println("value of first limit");
        // int l = sc.nextInt();
        // System.out.println("value of second limit");
        // int r = sc.nextInt();
        // queries_range_sum(v, l, r);

    }

    public class arrays_problems_4 {
        public static void main(String[] args) {
            ankita a = new ankita();
            a.ankitaa();

        }

    }

}
