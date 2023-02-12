import java.util.Scanner;

// given two number p raised to q using a recursive function

public class recursion_6 {

    static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int ans = pow(a, b / 2);
        if (b % 2 == 0) {

            return ans * ans;
        } else {

            return ans * ans * a;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();

        System.out.println("the ans is " + pow(a, b));
    }

}
