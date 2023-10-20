//

public class ll_implimentation {

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    // implimentation
    public static class linkedlist {
        node head = null;
        node tail = null;

        // no need to give the parameter because in this class
        // ll has head
        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " => ");
                temp = temp.next;

            }
            System.out.println();
        }

        // inserting at end

        void insertAtEnd(int data) {
            node temp = new node(data);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;

            }
        }

        // inserting at end
        void insertAtBeg(int data) {
            node temp = new node(data);
            if (head == null) {
                // head = tail = temp;
                insertAtEnd(data);
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // inserting at any index
        void insertAtAnyIdx(int data, int idx) {

            node t = new node(data);
            node temp = head;

            if (idx < 0 || idx > size()) {
                System.out.println("please enter valid index");

            }

            if (idx == 0) {
                insertAtBeg(data);
            }

            if (idx == size()) {
                insertAtEnd(data);
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {

                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

        }

        int getAtidx(int idx) {
            node temp = head;
            if (idx < 0 || idx > size()) {
                System.out.println("please enter valid index");
                return -1;
            }

            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // delete at idx
        void deleteAtIdx(int idx) {
            node temp = head;
            if (idx == 0) {
                head = head.next;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            
        }

        // size of ll
        int size() {
            node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }

    // static void insert_At_end(node head, int data) {
    // node temp = new node(data);
    // node t = head;
    // while (t.next != null) {
    // t = t.next;
    // }
    // t.next = temp;

    // }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(7);
        // ll.display(); // 2 => 3 => 7
        // System.out.println("the size is " + ll.size()); // 3

        ll.insertAtBeg(23);
        // ll.display(); // 13 => 2 => 3 => 7
        // System.out.println("the size is " + ll.size()); // 4

        ll.insertAtAnyIdx(45, 4);
        ll.insertAtAnyIdx(100, 0);
        System.out.println("head => " + ll.head.data + " " + " tail => " + ll.tail.data);
        // ll.display();
        System.out.println("the size is " + ll.size()); // 7

        // ll.insertAtAnyIdx(100, -3);
        // ll.insertAtAnyIdx(100, 40);

        System.out.println(ll.getAtidx(3));// 2
        System.out.println(ll.getAtidx(0));// 100

        System.out.println();
        ll.display(); //100 => 23 => 100 => 2 => 4 => 7 => 45 =>
        ll.deleteAtIdx(2);
        ll.deleteAtIdx(0);
        ll.display(); //23 => 2 => 4 => 7 => 45 => 

        ll.deleteAtIdx(3);
        ll.display(); //23 => 2 => 4 => 7 =>
        // System.out.println(ll.tail.data);

    }

}
