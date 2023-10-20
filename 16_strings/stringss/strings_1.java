package stringss;

import java.util.*;
import java.util.Scanner;

public class strings_1 {

    public static void main(String[] args) {
        // declaration and initialisation

        // printing the string

        String str = " varad ";
        System.out.println(str);

        // taking the input strings
        // but it will take only first strings
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // System.out.println(s);
        // but for taking all strings
        // String st = sc.nextLine();
        // System.out.println(st);

        // ===============================================
        // chatAt() and length();

        // lenght()
        String v = "ankita";
        int n = v.length();
        System.out.println("the lenght of ankita is " + n);
        // --------------------------------
        // chatAt();
        char charAt = v.charAt(3);
        System.out.println("the letter at index three is " + charAt);
        // =======================================================
        // indexOf() and compareTo();
        // indexOf();
        int idx = v.indexOf("i");
        System.out.println("the of dex of i is " + idx);

        // ------------------------------------
        // compareTo();
        // if both strings are same then it give the ans as the 1
        // if the first string id greater than string seconds b y lexiographically then
        // it give +vr and
        // otherwise it give -ve ans
        // for eg
        String aa = "amruta";
        String bb = "laki";

        int nn = aa.compareTo(bb);
        if (nn > 0) {
            System.out.println("the greater str is " + bb);
        } else {
            System.out.println("the greater str is " + aa);
        }
        String z = "hello ";
        String cc = "viha";
        // String dd = "viha";
        String dd = "niha";
        int nnn = cc.compareTo(dd);
        if (nnn == 0) {
            System.out.println("both strings are eqaul");
        } else {
            System.out.println("strings are not equal");
        }

        // =====================================================
        // contain();
        String str1 = "vrdu";
        System.out.println(str1.contains("rd"));
        // =====================================
        // StartsWith();
        System.out.println(str1.startsWith("vr"));
        // ======================================================
        System.out.println(str1.endsWith("du"));

        // =========================================
        // toLowerCase() , toUppercase(), ; concat();
        System.out.println(cc.toUpperCase());
        System.out.println(z.concat(cc));
        // =============================================
        System.out.println(cc.substring(3));
        System.out.println(cc.substring(2, 4));

        // ===================================================
        // mcq_1
        String x = "viha";
        for (int j = 0; j < x.length(); j++) {
            System.out.println(x.substring(j));
        }

        // =================================================
        

    }
}
