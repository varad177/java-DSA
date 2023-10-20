import java.util.Stack;

public class stack_4_display {

    public static void disPlayRecursively(Stack<Integer> st) {

        if (st.size() == 0)
            return;
        int top = st.pop();
        System.out.print(top + " ");
        disPlayRecursively(st);

        st.push(top);
        // System.out.println();
        // System.out.print(st+" ");

    }

    public static void disPlayRecurtion(Stack<Integer> st) {

        if (st.size() == 0)
            return;
        int top = st.pop();
        disPlayRecurtion(st);
        System.out.print(top + " ");

        // st.push(top);
        // System.out.println();
        // System.out.print(st+" ");

    }

    public static void PushAtBottom(Stack<Integer> st) {

        if (st.size() == 0) {
            st.push(0);
            return;
        }
        int top = st.pop();
        PushAtBottom(st);
        st.push(top);

        // time cmplexity is o(n)
        // but we use space here
        // here we use the call stack and call stack consumed the memory
        // we send the stack on different top , so there is the consume the call stack
        // memory
        // so space complexity is o(n)
    }

    public static void RemovedFromAnyIndex(Stack<Integer> st) {
        

        if (st.size() == 1) {
            st.pop();
            return;
        }

        int top = st.pop();
        RemovedFromAnyIndex(st);
        st.push(top);

    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // System.out.println(st); // [1, 2, 3, 4, 5]

        // Stack<Integer> rt = new Stack<>();
        // while (st.size() > 0) {
        // rt.push(st.pop());
        // }

        // while (rt.size() > 0) {
        // int x = rt.pop();
        // System.out.print(x + " ");
        // st.push(x);
        // }

        // System.out.println();
        // System.out.println("original stack is " + st);

        // by arrys

        // int n = st.size();
        // int[] arr = new int[n];

        // for (int i = n - 1; i >= 0; i--) {
        // arr[i] = st.pop();
        // }

        // for (int i = 0; i < n; i++) {

        // System.out.print(arr[i] + " ");
        // st.push(arr[i]);

        // }

        // System.out.println();

        // System.out.println("original stack is " + st);

        // recursively

        // disPlayRecursively(st);
        // System.out.println();
        // disPlayRecurtion(st);
        PushAtBottom(st);
        System.out.println(st);
        System.out.println();
        System.out.println("after removing from bottom ");
        RemovedFromAnyIndex(st);
        System.out.println(st);

        // System.out.println(st);

        // st is pass by reference

    }

}
