//give an array of name of the fruits , you are supposed to sort it in lexicographic 
//order using the selection sort
// lexicographical order means dictionary order 

//by compare if s1<s2 then it return -ve number 
//if equal themm return 0
// /if greater the return +ve number 

public class sorting_ques_2 {
    static void lexicographical(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min_index]) < 0) {
                    min_index = j;
                }
            }
            // swap
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        printarr(arr);

    }

    static void printarr(String[] arr) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        String[] arr = { "papaya", "lime", "watermelon", "apple", "mango", "kiwi" };
        System.out.println("original");
        printarr(arr);
        System.out.println("sorted");
        lexicographical(arr);

    }
}
