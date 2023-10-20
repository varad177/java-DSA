package stringss;

//str.equals() and ==

public class strings_5 {
    public static void main(String[] args) {

        // do not used == in the strings

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s3); //it result false 
        //it checks address first 
        //because memory address is different of both same strings 

        // but

        System.out.println(s2.equals(s3)); // it result true 
        //because it cheacks just the strings 
        

    }
}
