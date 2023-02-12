import java.util.Scanner;

//introduction to time_space_complexity
//type of time complexity
//calculation pf time complexit
//introduction space_complexity

//--->           overall running time depends on      <---
//1- logic/ algo
//2- language -> c / c++/ java/ python
//3- processor-> i3/ i5/ M1 / M1 pro etc

//--->            what  good program have          <---
//no of oparation have to less
//in below program no of oparation as a / function of input
//i.e the no of oparation depends on the input
//this analysis is called -> ASYMPTOTIC ANALYSIS 

//--->                type of time complexity        <---
//1- worst case time complexity
//2- best case time complexity
//3- avarage case time complexity

//--->      type of time complexity and their notations        <---
//1- worst case time complexity ==> Big O O(n), n is no of oparations 
//2- best case time complexity ==> Big omega  omegasymbol(1)
//3- avarage case time complexity ==> Big theta  thetasymbol(n)

//generally machine 
//1 sec me ==> 10 to power 8 to 10 to power 9
//oparation perform hota hai 

//the common error is there ====>>
//which is TLE
//i.e time limit exceeded
public class time_space_complexity {

    static void sums(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    static void sums2(int n) {
        long sum = (n * (n + 1)) / 2;

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        // sums(n);
        sums2(n);

    }
}