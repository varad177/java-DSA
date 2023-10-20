//set interface 

//1 - hash set , 2- linked hast set  , 3- sorted set 

// hash set 
//-> unorder 
//-> unique 
//-> not duplicate 
//--> uses hashing to stored the value 

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class java_collections_3 {

    // implimenting hashset
    static void hashsetExamples() {

        HashSet<Integer> st = new HashSet<>();

        st.add(4);
        st.add(7);
        st.add(9);
        st.add(1);
        st.add(1); // duplicate elements will not shown in result

        System.out.println(st); // [1, 4, 7, 9]

        // removing element
        // in that we have to give the element which we want to remove
        // e.g
        System.out.println(st.remove(1)); // true
        System.out.println(st); // [4, 7, 9]

        // checking contains
        System.out.println(st.contains(1)); // false

        // checking size
        System.out.println(st.size()); // 3

    }

    // Linked Hash Set
    // in this elements will stored in the order of entered 
    // posses unique property 


    static void LinkedhashsetExamples() {

        LinkedHashSet<Integer> st = new LinkedHashSet<>();

        st.add(4);
        st.add(7);
        st.add(9);
        st.add(1);
        st.add(45);
        st.add(468);
        st.add(15);
        st.add(985);
        System.out.println(st);

    }

    //implementing tree hash set 
    //elements are stored in incresing order 
       

    static void TreeHasSet(){
        TreeSet <Integer> t = new TreeSet<>();

        t.add(4);
        t.add(7);
        t.add(9);
        t.add(3);
        t.add(34);
        System.out.println(t);
      }
    public static void main(String[] args) {
        // hashsetExamples();
        // LinkedhashsetExamples();
        TreeHasSet();

    }
}
