import java.util.Arrays;

//taking input 
//for array printing

class ae {
    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // for counting a element in array
    static void count(int arr[], int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }

        }
        System.out.println("frequency of " + x + " is " + count);
    }

    // for counting last occurance in array of perticular element
    static void lastocc(int arr[], int x) {
        int lastind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastind = i + 1;
            }
        }
        System.out.println("the last occurance of " + x + " is " + lastind);
    }

    // for counting num of elements
    static void countthenumofele(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println("the elements greater thant " + x + " is " + count);

    }

    // for checking sort or not
    static void sort(int arr[]) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;

            }
        }
        if (check == true) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }

    }

    // for finding small or largest elements
    static void small_and_largest_element(int arr[]) {
        int s = arr[0];
        int l = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                l = arr[i];
            }
        }
        System.out.println("the largest element is " + l);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                s = arr[i];

            }
        }
        System.out.println("the smallest element is " + s);

    }

    void num() {

        int[] ages = { 11, 22, 33, 44, 55 };
        System.out.println("original arrays");
        printarr(ages);

        int[] ages2 = ages; /// copyng array but ye dono arrays ek hi address ko point krti hai
        // isiliye agar arra2 me change kiya to array 1 bhi badal jata hai
        System.out.println("copy array");
        printarr(ages2);

        // doing some changes

        int[] ages22 = ages.clone();// arraysname.clone use krne se oroginal array me changes nahi hote ;

        ages22[2] = 10;
        ages22[4] = 15;
        System.out.println("array after change");

        printarr(ages22);
        System.out.println("copy by range");
        int[] arr3 = Arrays.copyOfRange(ages, 1, 4); // isase ham ek specific range copy kr skte hai arrays ki

        printarr(arr3);
        int[] num = { 1, 2, 3, 4, 3, 2, 5, 5, 5, 5, 6, 5, 4, };
        count(num, 4);
        lastocc(num, 5);
        countthenumofele(num, 5);
        int[] nums = { 1, 2, 3, 4, 3, 2, 5, 111, 5, 5 };
        int[] numss = { 1, 2, 4, 6, 7, 8 };
        sort(nums);
        sort(numss);
        small_and_largest_element(nums);

    }
}

public class arrays_copy_clonning {
    public static void main(String[] args) {
        ae t = new ae();
        t.num();
    }

}
