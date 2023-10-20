
public class oops_4 {

    public static void main(String[] args) {
        student s = new student();
        s.name = "varad";
        System.out.println(s.name); // varad

        // s.rno = 23; we cannot acces because it it private in the student class

        // System.out.println(s.rno);// cannot access

        // but we can access by get method
        // function can be access by dot oparator

        System.out.println(s.getrno()); // 0

        // now setter

        // s.rno = 23
        // it is not aloud because rno is private so
        // we can used setter
        // like

        s.setrno(23);

        System.out.println(s.getrno());// 23

    }
}
