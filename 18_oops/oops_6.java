//constructor

public class oops_6 {

    public static class student {
        String name;
        int rollno;
        double percentage;

        public student(String nm, int rno, double per) {
            name = nm;
            rollno = rno;
            percentage = per;

        }

        // default constructor\
        public student() {

        }

    }

    // making constructor
    // in this there is no datatype

    public static void main(String[] args) {
        student s = new student("viha", 12, 96.60);
        System.out.println(s.name);
        System.out.println(s.rollno);
        System.out.println(s.percentage);

        System.out.println();

        student t = new student("varad", 32, 93.60);
        System.out.println(t.name);
        System.out.println(t.rollno);
        System.out.println(t.percentage);

        // student t = new student();
        // if we make constructor then we have to give parameter in the
        // so we have to make default constructor

        System.out.println();//it will not produced error 
        //because we make default constructor 


        student z = new student();
        z.name = "amruta";
        System.out.println(z.name);


    }

}
