
//displaying LL

public class linked_list_2 {

    // creating node
    public static class node {
        int data; // valus
        node next; // address of next node

        public node(int data) {
            this.data = data;
        }
    }

    // making function for display ll;

    public static void display(node head) {
        node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;

        }
    }

    // making function for display ll recursively;
    public static void display_recursively(node head) {
        if (head.next == null)
            return;

        System.out.print(head.data + " => ");
        display_recursively(head.next);

    }

    // making function for display ll recursively and reverse;
    public static void display_recursively_reverse(node head) {
        if (head.next == null)
            return;
        display_recursively(head.next);

        System.out.print(head.data + " => ");

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

        // simple
        // System.out.println(s1.data);
        // System.out.println(s2.data);
        // System.out.println(s3.data);

        // advanced
        // for that we make temp node
        // and we can use loop
        // node temp = s1;
        // for (int i = 0; i <= 5; i++) {
        // System.out.print(temp.data + " => ");
        // temp = temp.next;

        // //we know the size of ll so we used for loop
        // }

        // by white loop

        node temp = s1;// we use temp for preserving the head property

        while (temp.next != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;

        }
        System.out.println();
        display(s1);
        System.out.println();

        // =============================================

        // can we do it recursively
        display_recursively(s1);
        System.out.println();

        // =============================================
        //can we do it reverse 
        display_recursively_reverse(s1);
        System.out.println();

    }

}
