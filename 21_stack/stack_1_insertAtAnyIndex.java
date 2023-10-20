import java.util.Stack;

public class stack_1_insertAtAnyIndex {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st); // [1, 2, 3, 4, 5]

        // inserting at the bottom

        Stack<Integer> rt = new Stack<>();
        while (st.size() > 1) {
            rt.push(st.pop());
        }

        st.push(6);
        while (rt.size() > 0) {
            st.push(rt.pop());
        }

        System.out.println(st); // [1, 2, 3, 4, 5, 6]

    }

}
