//static functions 

// so the static functions is used 
//if we want to access a function in the class through just class name 

public class oops_9 {

    public static class student {
        String name;
        int rollno;
        double percentage;
        private static int no_of_student;
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

        // getter
        public static  int get_no_of_student() {
            return no_of_student;

        }

        public static void main(String[] args) {

            // static is like shared variable
            // so it can access without making onject;

            student.no_of_student = 100;
            // but it will be problematic
            // so we can make private
            // and make getter and setter

            System.out.println(student.no_of_student);
            System.out.println(student.get_no_of_student);//produncing error 
            //

        }

    }
}
