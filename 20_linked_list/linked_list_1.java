//linked list 

//in arrays
// arryays is of fixed size
// and  we have to give size at starting
// it take contiguous memory 
// if want to get the perticular arrays 
//then it takes o(1);
//inserting element in between then it takes o(n);

// in arrys list if the size finish then arrays list make a same size arrys 
/// so the size will double //
// it result the space wastage 

//but in linked list 
// it also a  data structure in which we can add element dynamically 
//linked list is the made up of nodes
//node made up of two block
//first block contains data 
//second block contains the address of next elements 
//last node does not have node front of this 
// so it contains null as a adress 
//means it does not point any node
//first node called head
// last node called tails 

//next is property which contains address of next node 

// ===============================================

//does linked list overcomes the arrys's limitations 
//inserting elemet is also easy 
//but getting or fetching element from ll it takes o(n);

// ====================================

// types of linked list
// 1-> singly ll ==> contain address of next node
// 2-> doublly ll ==> contain next and previoues address of node 
// 3->circular linked list ==> tail contain address of head 

public class linked_list_1 {

    // creating node
    public static class node {
        int data; // valus
        node next; // address of next node

        public node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        node s1 = new node(4);
        node s2 = new node(6);
        node s3 = new node(7);
        node s4 = new node(8);
        node s5 = new node(9);

        // 4->6->7->8->9
        // for linking

        s1.next = s2; // 4 -> 6 7 8 9
        s2.next = s3; // 4 -> 6 -> 7 8 9
        s3.next = s4; // 4 -> 6 -> 7 -> 8 9
        s4.next = s5; // 4 -> 6 -> 7 -> 8 -> 9

        System.out.println(s1.next.next.data); // 6
        System.out.println(s2.data); // 6

        System.out.println(s1.next.next.data); // 7

        // System.out.println(s1.next); //linked_list_1$node@4617c264
        // System.out.println(s2); //linked_list_1$node@4617c264

        // System.out.println(x.data); // 0
        // System.out.println(x.next); // null

    }

}