import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

//write a methods only once and use it many times
//method can be declare as follow
//access modifiers--return type- methods type--(parameters)
//public int sum(int a, int b){}

class vrd {
    int sum(int a, int b) {
        int Result = a + b;
        return Result;
    }
}

public class opps_methods {
    public static void main(String[] args) {
        vrd v = new vrd();
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = v.sum(a, b);
        System.out.println("the sum is");
        System.out.println(x);
        ;

    }
}
