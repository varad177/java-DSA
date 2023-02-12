import java.util.Scanner;

// given a number and  value k , print the k multiples of num
// if num = 12 , and k = 5
// => 12,24,36,48,60
public class recursion_7 {

    static void fun(int n, int k) {
        // base case
        if (k == 1) {
            System.out.println(n);
            return;
        }
        // recursion case
        fun(n, k - 1);
        // self work
        System.out.println(n * k);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n vaiue");
        int n = sc.nextInt();
        System.out.println("enter the k value");
        int k = sc.nextInt();
        fun(n, k);
    }
}
