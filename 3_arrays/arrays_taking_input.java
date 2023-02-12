import java.util.Scanner;

//taking input 

class taking_input {
    static void printarr(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    void num() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lenght");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.println("input the value");
        int i = 0;
        while (i < ages.length) {
            if (i < ages.length) {
                ages[i] = sc.nextInt();
            } else {
                System.out.println("arrays is full ");
            }
            i++;

        }
        
        printarr(ages);
    }
}

public class arrays_taking_input {
    public static void main(String[] args) {
        taking_input t = new taking_input();
        t.num();
    }

}
