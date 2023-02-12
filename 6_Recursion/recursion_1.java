import java.util.Scanner;

// we will learn \
//intro to recursion 
//working rule of recursive function
//problems based on recursion

//recursion==>>method calling itself

//PIM==>
//principle of mathematical induction 

// ..q.1
//WAP to print all natural number from 1 to n using recursion 

////////////////////////////////////////////

//the recursion spell
//1=> identify the smaller problem-->let recursion solve it
//2=> self work you do it by own
//3=> identify the base case

public class recursion_1 {

    static void printsum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // but by resursion

    static void printncresing(int n) {
        // agar ham 1 ko manage nahi karenge to
        // hame stack overflow error mil jati hai ;
        // isko base case kehte hai
        // nahi to infinite recursion ho jyata
        // isiko halting condition kehte hai

        // so basically a function callimg itself with different parameter
        // and a base case to terminate the infinite loop

        if (n == 1) {
            System.out.print(1 + " ");
            // /base case
            return;
        } else {
            printncresing(n - 1);// ye recursion kiya
            System.out.print(n + " ");// 1,2,3...n-1;
            // print krke hmne self work kiya
           
        }
    }

    static void printderesing(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        else{
            System.out.print(n+" ");
            printderesing(n-1);
        }
        
    }
    

    static void printsum2(int n) {
        int sum = (n * (n + 1) / 2);
        System.out.println(sum);
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        // printsum(n);
        // printsum2(n);
        printncresing(n);
        System.out.println();
        printderesing(n);
    }
}

//why we need recursion 
//