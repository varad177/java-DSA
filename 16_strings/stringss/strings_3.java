package stringss;

//interning and new 

public class strings_3 {
    public static void main(String[] args) {
        String str = " hello";
        String gtr = " hello";
        // here both str and gtr pointing the same memery address
        // so there is no new strings
        // this is called interning
        // it it used to save the space

        // but if i write
        String s = new String("hello");
        // here the string is same but memory address will be different

        
    }

}
