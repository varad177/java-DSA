import java.rmi.Remote;
import java.util.*;
///hash set
//set is bag which does not contain duplicate element
//it is unorder
//



public class hash_set_1{

    public static void main(String[] args) {
        
        HashSet<String> st = new HashSet<>();
        st.add("varad");
        st.add("viha");
        st.add("amu");
        st.add("laki");

        System.out.println(st); //[laki, varad, amu, viha]
        st.add("varad"); //dont allow duplicate
        System.out.println(st); //[laki, varad, amu, viha]

        System.out.println(st.contains("viha"));  //true

        //size
        System.out.println(st.size()); //4

        // Remove

        System.out.println(st.remove("amu")); //true
        System.out.println(st.size()); //3
        System.out.println(st.remove("amu")); //false



    }
}