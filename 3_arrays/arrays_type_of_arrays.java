//ty7pes of array s
// two types of array
//1- single dimension array 
//2- multi dimension array 

// 2d arrays declaration
// int [] [] multiarrays= new int[4][3];
// or
// int [] [] multiarraay= new {{1,2,3},{4,5,6}};

class Arrayex {
    void demoarray() {
        int[][] age = new int[4][3];
        int[][] ages = { { 1, 2 }, { 2, 3 }, { 4, 5, 6 } };
        age[0][0] = 5;
        age[0][1] = 6;
        age[1][0] = 7;
        age[1][1] = 8;

        System.out.println(ages[0][1]); // will be print
        System.out.println(age[1][1]);

        //similarly we can make 3d array also

    }
}

public class arrays_type_of_arrays {
    public static void main(String[] args) {
        Arrayex a = new Arrayex();
        a.demoarray();

    }
}
