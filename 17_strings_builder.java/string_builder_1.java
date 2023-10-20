//in string we have many problems
//like interning , immutability , por performance 
//for solving these problems 
// we use strings builder 

import java.util.*;

public class string_builder_1 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        // we can give capacity also
        // in str we cannot add string
        // like str + world is not aloud
        // for that we use append
        // we can appent string , integer , float , double , boolean

        str.append(" world ");
        str.append(123);
        System.out.println(str);

        // in string we have charAt function
        // but we dont have setchatAt function
        // like

        // we have change the string but setCharAt) function
        StringBuilder s2 = new StringBuilder("varad");
        s2.setCharAt(0, 'b');
        System.out.println(s2);

    }

}
