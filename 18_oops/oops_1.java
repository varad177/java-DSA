
//java  is object oriented
// programming language 
// /class 
//making class means new data type 

public class oops_1 {

    public static class student {
        // creating new datatype

        String name;
        int rollno;
        double percentage;

    }

    // we can make class in the main function 
    //but the class which are in the main class 
    // then the limit of that class is in the main fun only 
    //cannot access out of the main function
    

    public static void main(String[] args) {

        student x = new student(); // declaration
        // for setting value user dot oparator

        // initialisation
        x.name = "varad";
        x.rollno = 23;
        x.percentage = 91.40;
        System.out.println(x); // output => oops_1$student@4617c264

        System.out.println(x.name); // varad
        System.out.println(x.rollno); // 23
        System.out.println(x.percentage + 8); // 99.40
        System.out.println();

        student y = new student(); // declaration
        // for setting value user dot oparator

        // initialisation
        y.name = "viha";
        y.rollno = 13;
        y.percentage = 95.60;

        System.out.println(y.name); // viha
        System.out.println(y.rollno); // 13
        System.out.println(y.percentage); // 95.60

    }
}
// we we want to store without class
// then we have to make 3 arrays


//array vs class
// we used array when we want to stored same type of data 