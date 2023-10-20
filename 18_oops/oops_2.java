
import java.util.Scanner;
//scanner is also a class



public class oops_2 {

    public static class student {
        // creating new datatype

        String name;
        int rollno;
        double percentage;

    }

    static void change(student y){
        y.name = "viha";
        y.rollno = 13;
        y.percentage = 95.60;

    }


    public static void main(String[] args) {


        student x = new student(); // declaration


        x.name = "varad";
        x.rollno = 23;
        x.percentage = 91.40;
        change(x);
        System.out.println(x.name); // viha
        System.out.println(x.rollno); // 13
        System.out.println(x.percentage); //95.60
        // so we can say that classes are passed by reference 
        // so they can change outside the main class

        
    }
    
}
