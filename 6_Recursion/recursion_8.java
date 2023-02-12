import java.util.Scanner;

//given a number n. find the sum of the natural number till n but with alternate sign
public class recursion_8 {
    static int sumwithalternatesign(int n) {

        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {

            return sumwithalternatesign(n - 1) - n;

        }
        return sumwithalternatesign(n - 1) + n;

    }

    static int series(int n) {
        if (n == 0) {
            return 0;
        }
        return series(n - 1) + n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n vaiue");
        int n = sc.nextInt();
        System.out.println("series sum is " + series(n));
        System.out.println("sum with alternate sign " + sumwithalternatesign(n));

    }

}
