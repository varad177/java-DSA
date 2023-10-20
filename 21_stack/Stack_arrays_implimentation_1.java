
import java.util.*;

public class Stack_arrays_implimentation_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        // int n;
        // System.out.println("enter the number of element you want to insert");

        // n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.println("enter the element No:" + i + " ");

        // int x = sc.nextInt();
        // st.push(x);
        // }

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        Stack<Integer> rst = new Stack<>();

        while (st.size() > 0) {

            // int val = st.peek();
            // rst.push(val);
            // st.pop();

            // or

            rst.push(st.pop());

        }

        System.out.println(rst); // [5, 4, 3, 2, 1]

        Stack<Integer> ast = new Stack<>();

        while (rst.size() > 0) {

            // int val = st.peek();
            // rst.push(val);
            // st.pop();

            // or

            ast.push(rst.pop());

        }

        System.out.println(ast);
        //for copy stack O(n)

        


    }
}
