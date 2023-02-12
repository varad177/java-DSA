import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("enter the number of row & column");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int i,j;
        
        for (i = 0; i < r; i++) {
            for (j = 0; j< c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
