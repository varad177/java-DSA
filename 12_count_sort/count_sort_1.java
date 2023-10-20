//count sort is used when range in defined
//and it is not comparision based algo
//not a inplace algo
//in this under certain conditions count sort is better than other algo 
//in this we first make frequency arrays 
//for frequency array first find the largest element from the arrys 
//and make the frequency array of that size
//and on the basis of frequency we have to insert the element in the ans arrys 
//sometimes we  can sacrifies stability property entirely


public class count_sort_1 {
    static int findmax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void basiccountsort(int[] arr) {
        // find the largest element
        int max = findmax(arr);
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    static void printarr(int[] arr) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 2, 5 };
        System.out.println("original array ");
        printarr(arr);
        basiccountsort(arr);
        System.out.println("sorted array");
        printarr(arr);

    }
}