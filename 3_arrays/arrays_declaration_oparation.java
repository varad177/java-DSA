
//arrays declaration and some oparation
//arrays is data structure which is collection of similar type of data 
// arrays have zero based indexing 
//memory allocation is contigenous 
//arrays declaration -->  int[] ages
//syntax of array declaration --->> int []  ages = new int [size]
//String[] names = new String [size] 
//ARRAY LITERAL DECLARATION-->> int [] arrays = {store whatever you want , no need to specifies the size}
//MEMORY ALLOCATION IN ARRAYS -->>

class arrayexample {
    void demoarrayys() {
        int[] ages = new int[5];
        String[] name = { "varad", "isha", "amu" }; // array literal

        ages[0] = 5;
        ages[1] = 6;
        ages[2] = 7;
        ages[3] = 8;
        ages[4] = 9;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);


        System.out.println("the lenght is ");
        int l = ages.length; // name.lenght lagakar ham array ki len ght find kar skte hai
        System.out.println(l);

    }
}

public class arrays_declaration_oparation {
    public static void main(String[] args) {
        arrayexample a = new arrayexample();
        a.demoarrayys();
    }
}
