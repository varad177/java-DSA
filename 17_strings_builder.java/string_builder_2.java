
//insert(idx ,ch) and deleteaCharAt(ch)

//insert is used to insert the element in the string 
// but appent is used to set the element in the last only 

import java.util.*;;

public class string_builder_2 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello");
        s1.insert(2, "y");
        System.out.println(s1); //heyllo
        // it used o(n^2) operation 


        // used to delete the element 
        // idx has to be give 

        s1.deleteCharAt(2);
        System.out.println(s1); //hello

    }
}