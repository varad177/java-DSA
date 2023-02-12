import java.util.Scanner;

// given two number p raised to q using a recursive function

public class recursion_5 {

    static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return pow(a, b - 1) * a;
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
