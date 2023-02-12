//selection sort
//in selection sort basically we select a perticular element and put its at it correct position
//first we find the minimum element and put it at the first element 
//by this process we sort the arrays 

public class selection_sort_1 {

    static void selection_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {// (n-1)
            // i represent current index
            // find minimum, index in un sorted array
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {

                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        printarr(arr);

    }

    static void printarr(int[] arr) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] a = { 99, 88, 77, 66, 55, 44, 33, 22, 11 };
        System.out.println("original array :");
        printarr(a);
        System.out.println("sorted array :");
        selection_sort(a);

    }
}

// time complexity
// o(n**2)
//it is unstable

//it is in-place algorithm