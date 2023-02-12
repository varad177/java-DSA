import java.util.Scanner;



// fibonacci series
//0 => 1 => 1 => 2 => 3 => 5 => 8 => 13

public class recursion_3 {

    // /find nth fibonacci number

    static int fibinacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {

            // int prev = fibinacci(n - 1);
            // int prepre = fibinacci(n - 2);
            // int ans = prev + prepre;
            // return ans;
            return fibinacci(n - 1) + fibinacci(n - 2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for fibinacci");
        int n = sc.nextInt();
        // System.out.println(fibinacci(n));
        for (int i = 0; i <= n; i++) {
            System.out.println(fibinacci(i));

        }
    }

}
