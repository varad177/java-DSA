//   wrapper class 
//wrapper classes me primitive datatype wrap hote hai 
//e.g int , float, boolean
//

import java.util.ArrayList;

public class array_list_1 {
    public static void main(String[] args) {
        // Integer i = Integer.valueOf(4);
        // System.out.println(i);
        // Float f = Float.valueOf(6.7f);
        // System.out.println(f);
        ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Boolean> l2 = new ArrayList<>();
        // ArrayList<Float> l3 = new ArrayList<>();

        // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get element at index i
        // System.out.println(l1.get(1));
        // print arraylist
        // for (int i = 0; i < l1.size(); i++) {
        // System.out.println(l1.get(i));
        // }

        // adding element at index i
        l1.add(0, 4);
        // we can direct;y print the arrayslist

        // System.out.println("lisr size is "+l1.size());
        l1.set(2, 100);
        System.out.println(l1);

        // remove element
        l1.remove(2);
        System.out.println(l1);

        // removing element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);
        // checing element exist or not
        boolean ans = l1.contains(Integer.valueOf(5));
        System.out.println(ans);


        ArrayList l = new ArrayList<>();
        l.add("varad");
        l.add("is");
        l.add(20);
        l.add("year old");

        System.out.println(l);

    }

}