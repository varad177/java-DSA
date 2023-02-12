import java.util.*;

class input_scanner {
    public static void main(String[] args) {
        System.out.println("enter your lucky number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("num is " + x);

        System.out.println("enter name");
        String s = sc.next(); // next() se ham sirf e name input le skte hai
        System.out.println("your name is " + s);

        System.out.println("enter full  name");
        Scanner f = new Scanner(System.in);
        String v = f.nextLine(); // agr hamne nextLine() use kiya to puri line ham input le skte jai
        System.out.println("your name is " + v);

        // we can use nextFloat() fot taking input float value
        

    }
}