//java collections 
//collections are grouo of similar objects 
//frameworks => the set of classes and interfaces 
//interface =>  blue print of a class 
// ================================================

//methods of collections interfaces 
// add(e);
//clear();
//contains(object o);
//equals (object 0);
//remove (object 0);
//size();

// ==============================================

//list interface
// 1-arraylist , 2- linked list , 3- stack 

import java.util.*;

public class java_collections_1 {

    // implimenting arraylist
    static void ArrayListExamples() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(6);
        l.add(8);

        // printing arraylist

        System.out.println(l);

        // getting elements
        int a = l.get(0);
        System.out.println(a);

        // modifying element

        l.set(0, 100); // ( idx , element)

        System.out.println(l);
        System.out.println(l.get(0));

    }

    // implimenting linked list
    static void linkedListExamples() {

        LinkedList<Integer> l = new LinkedList<>();
        l.add(2);
        l.add(1);
        l.add(3);
        l.add(6);
        l.add(8);

        System.out.println(l);

        System.out.println(l);

        // getting elements
        int a = l.get(0);
        System.out.println(a);

        // modifying element

        l.set(0, 100); // ( idx , element)

        System.out.println(l);
        System.out.println(l.get(0));

    }

    static void stackExamples() {
        Stack<String> st = new Stack<>();
        st.push("varad");
        st.push("viha");

        // ptinting stack
        System.out.println(st); // [varad , viha ]

        // getting top value
        System.out.println(st.peek());// viha

        // popping top value
        System.out.println(st.pop());
        System.out.println(st); // varad

        // checking size
        System.out.println(st.size()); // 1

        // /checking empty
        System.out.println(st.empty()); //false
        st.pop();
        System.out.println(st.empty()); //true

        st.push("hii");
        st.push("varad");



    }

    public static void main(String[] args) {

        // ArrayListExamples();
        // linkedListExamples();
        stackExamples();

    }

}
