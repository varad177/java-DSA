
//length of ll

public class ll_length {

    // creating node
    public static class node {
        int data; // valus
        node next; // address of next node

        public node(int data) {
            this.data = data;
        }
    }

    public static int ll_length(node a) {
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }

    public static void main(String[] args) {

        node s1 = new node(4);
        node s2 = new node(6);
        node s3 = new node(7);
        node s4 = new node(8);
        node s5 = new node(9);
        // linking
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;

        int len = ll_length(s1);
        System.out.println(" node length is " + len);

    }
}