import java.util.Scanner;

public class recursion_2 {

    // we have to calculate the factorial the given number n

    static int factorial(int n) {
        if (n == 1) { // base case;;
            return 1;
        } else {
            // int fact = factorial(n - 1);// small problems
            // int ans = n * fact;
            // return ans;
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for factorial");
        int n = sc.nextInt();
        System.out.println("the factorial is " + factorial(n));

    }

}
