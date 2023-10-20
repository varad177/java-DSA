
//in stack there sre three oparation 
// push -> pushing the element 
// pop -- pop the top most value 
// peek - > return the top most value 

//aur sbki tiem complexity hai order of 1 -> O(1)

//srack work on the principle of LIFO -> last in first out 
//jo last me gaya hai vo pehle bahar aata hai 

//basics of stack of of java 

import java.util.*;

public class Stack_arrays_implimentation {

    public static void main(String[] args) {

        // arr declaration
        // int [] arr = new int[3];

        // declaration by arraylist
        // ArrayList<Integer> arr = new ArrayList<>();

        // stack declaration
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(23);
        st.push(92);
        st.push(5);

        System.out.println(st); // [1, 23, 92, 5]

        // peek
        System.out.println(st.peek()); // 5 (the top most value )
        // peek se value milti hai stack se nahar nahi jati
        System.out.println(st); // [1, 23, 92, 5]
        st.push(34);
        System.out.println(st); // [1, 23, 92, 5 , 34]

        st.pop();
        System.out.println(st);// [1, 23, 92, 5 ]

        System.out.println("the pop " + st.pop()); // the pop5
        System.out.println(st);// [1, 23, 92]

        // stack size
        System.out.println("the size is " + st.size()); // 3

        // printing the first element

        while (st.size() > 1) {
            st.pop();
        }

        System.out.println(st.peek()); // but stack is empty

        // is empty
        System.out.println(st.isEmpty()); // false

        st.pop();
        System.out.println(st.isEmpty()); // true

        // now here we will see the how to get the perticular element with out deleting
        // the elements
        // for that we have to copy the elements in anouthe stack 



    }

}