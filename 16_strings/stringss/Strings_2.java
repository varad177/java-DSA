package stringss;
//print all sub strings 

public class Strings_2 {

    public static void main(String[] args) {

        String str = "abcd"; // idx = 0 -3
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.print(str.substring(i, j) + " ");
            }

        }

    }

}
