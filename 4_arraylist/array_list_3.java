import java.util.ArrayList;
import java.util.Collections;

public class array_list_3 {

    // program to sort an arraylist of string in descending order

    static void ascendingsort(ArrayList<Integer> l) {
        System.out.println("original list");
        System.out.println(l);
        Collections.sort(l);
        System.out.println("ascending order");
        System.out.println(l);

    }

    static void descendingsort(ArrayList<Integer> l) {
        System.out.println("original list");
        System.out.println(l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("descending order");
        System.out.println(l);
    }
    

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(4);
        l.add(3);
        l.add(4);
        l.add(7);
        l.add(2);
        l.add(3);

        
        ascendingsort(l);

        descendingsort(l);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("welcome");
        l2.add("to");
        l2.add("my");
        l2.add("world");
        Collections.sort(l2);
        System.out.println(l2);
        Collections.sort(l2, Collections.reverseOrder());
        System.out.println(l2);
    }
}
