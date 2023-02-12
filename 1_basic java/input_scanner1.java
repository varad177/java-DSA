import java.security.Signature;
import java.util.Scanner;

public class input_scanner1 {

    public static void main(String[] args) {
        ///program to read character
        System.out.println("enter name-->");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);  /////by charAt() ham kiti position ka character find kr skte hai;;
        System.out.println("first latter is "+ ch);

    }
    
}
