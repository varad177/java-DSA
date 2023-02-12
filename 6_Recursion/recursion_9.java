
//find GCD
//greatesh common diviser
import java.util.*;

public class recursion_9 {

    static int igcd(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;

        }
        return y;

    }

    static int gcdbyeuclid(int x, int y){
        if(y==0){
            return x;
        }
        return gcdbyeuclid(y, x%y);
    }

    // euclids algorithm
    // gcd(x, y)=gcd(y,x%y)
    //gcd(x,0)=x

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x vaiue");
        int x = sc.nextInt();
        System.out.println("enter the y value");
        int y = sc.nextInt();

        System.out.println("the gcd is : " + igcd(x, y));
        System.out.println("the gcd by euclid  : " + gcdbyeuclid(x, y));
    }

}
