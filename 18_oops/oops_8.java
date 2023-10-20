// static keywords 

public class oops_8 {

    public static class student {
        String name;
        int rollno;
        double percentage;
        static int no_of_student;
        // by static - it will remains static for all object
        // it is like globle variable

        public student(String nm, int rno, double per) {
            name = nm;
            rollno = rno;
            percentage = per;

        }

        // default constructor\
        public student() {

        }

    }

    public static void main(String[] args) {
        student s1 = new student("varad", 23, 81.40);
        s1.no_of_student++; // 1

        student s2 = new student("varad", 23, 91.40);
        s2.no_of_student++; // 2

        student s3 = new student("varad", 23, 91.40);
        s2.no_of_student++; // 3

        System.out.println("number of student are " + s3.no_of_student); // 3
        // it result only 1 for all the object
        // for getting the no of students
        // we have to use the static student

    }

}
