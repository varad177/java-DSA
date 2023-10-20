import java.util.*;

// reverse() and delete()

// we have inbuild function for reverse 

public class string_builder_3 {

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("varad");
        System.out.println(s1); // varad

        // reverse()

        s1.reverse();
        System.out.println(s1); // darav

        s1.reverse();// varad

        // delete
         s1.delete(1, 3);
        // s1.delete(0, s1.length());
        System.out.println(s1);

    }

}
