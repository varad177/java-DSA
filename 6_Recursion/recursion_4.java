import java.util.Scanner;

// given an integer , find the sum of its digits using recursion

public class recursion_4 {

    static int findsumofdigit(int n) {
        /// base case
        if (n >= 0 && n <= 9) {
            return n;
        }

        // int smallans = findsumofdigit(n / 10);

        // int ans = smallans + n % 10;
        //return ans;

        return findsumofdigit(n/10)+n%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();
        int ans =findsumofdigit(n);
        System.out.println(ans);

    }

}
