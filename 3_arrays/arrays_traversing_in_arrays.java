import java.util.Scanner;

import javax.sound.midi.Soundbank;

//arrays ke sare elements print karne ke liye ham loop laga sklte hai 

class arrayexamples {
    void demoarrayys() {
        int[] ages = new int[5];
        String[] names = { "varad", "isha", "amu" }; // array literal

        ages[0] = 5;
        ages[1] = 6;
        ages[2] = 12;
        ages[3] = 8;
        ages[4] = 9;

        System.out.println("by simple loop");
        for (int i = 0; i < 5; i++) { // it is a simple loop
            System.out.println(ages[i]);
        }
        System.out.println("by for each  loop");

        for (int x : ages) {
            System.out.println(x);
        }

        for (String name : names) { // for each loop
            System.out.println(name);
        }

        System.out.println("by while loop");

        int i = 0;
        while (i < 5) {
            System.out.println(ages[i]);
            i++;
        }
        System.out.println();
        System.out.println("CALCULATING SUM");
        int sum = 0;
        for (int k = 0; k < 5; k++) {
            sum = sum + ages[k]; // calculation sum of element

        }
        System.out.println("the sum of ages is " + sum);

        System.out.println();
        System.out.println("CALCULATING HIGEST ELEMENT");
        int ans = 0;
        int z = 0;

        while (z < ages.length) {
            if (ans < ages[z]) {
                ans = ages[z];
            }

            z++;
        }
        System.out.println(ans);

        System.out.println();
        System.out.println("CALCULATING LOWEST ELEMENT");
        int anss = ages[0];
        int x = 0;

        while (x < ages.length) {
            if (ages[x] <= anss) {
                anss = ages[x];
            }

            x++;
        }
        System.out.println(anss);

        System.out.println("searchting");
        System.out.println("which value has to be search ");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int d = 0, s = 0;
        while (d < ages.length) {
            s++;
            if (ages[d]==v) {
                System.out.println(" the value "+v+" present at " +s);
              
            } 
            d++;

        }

    }
}

class Arraye {
    void demoarray() {
        System.out.println();
        System.out.println();
        System.out.println("MULTI ARRAYS ");
        int[][] age = new int[3][2];
        int[][] ages = { { 1, 2, 9 }, { 2, 3, 9 }, { 4, 5, 6 } };
        age[0][0] = 5;
        age[0][1] = 6;
        age[1][0] = 7;
        age[1][1] = 8;
        age[2][0] = 9;
        age[2][1] = 10;

        for (int i = 0; i < 3; i++) { // mult arrays ke liye nexted array lagana padta hai

            for (int j = 0; j < 2; j++) {
                System.out.println(age[i][j]);
            }
        }
        System.out.println("for ages");
        for (int i = 0; i < 3; i++) { // mult arrays ke liye nexted array lagana padta hai

            for (int j = 0; j < 3; j++) {
                System.out.print(ages[i][j]);
            }
            System.out.println();
        }
    }
}

public class arrays_traversing_in_arrays {
    public static void main(String[] args) {
        arrayexamples a = new arrayexamples();
        a.demoarrayys();
        Arraye ar = new Arraye();
        ar.demoarray();
        ;
    }
}