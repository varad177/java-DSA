import java.util.Stack;

public class stack_5_reverse {

    public static void PushAtBottom(int top , Stack <Integer> st) {

        if(st.size() ==0) st.push(top);
       int top2 = st.pop();

       PushAtBottom(top2 , st);

       st.push(top2);

    }

    public static void reverserStack(Stack<Integer> st) {

        if (st.size() == 1) {
            return;

        }

        int top = st.pop();

        reverserStack(st);
        PushAtBottom(top, st);

    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("new stack");
        System.out.println(st);

        // Stack<Integer> qt = new Stack<>();

        // while (st.size() > 0) {
        // qt.push(st.pop());

        // }
        // System.out.println("stack after reversing ");

        // System.out.println(qt);

        System.out.println("stack after recirsivly reversing ");
        reverserStack(st);
        System.out.println();
        System.out.println(st);

    }

}
