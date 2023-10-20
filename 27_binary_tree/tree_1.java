//trree is the hirarchical data structure 
// treer data structure is just like real tree 
// but the in data structure in root are at up 
// first node is called root node 
// in binary tree there id only two node connected to one node 
// left node called left child 
// right node is called right child 
// and the upper node is called as the  parent child 
// node whic have same parent it is called siblings 
// the lastest node which not any child is called leaf 
//ancestor => is known as perviously connected node
// in tree there are level 
// level is also called depth 
// sub tree => a small tree which connected to the node is called sub tree 
//

public class tree_1 {

    static class Node { // making the tree node 
        int data;
        Node left;
        Node right;

        Node(int data) { // constructor for getting the data 
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree { //for making the tree data structure 

        static int idx = -1; // index for traversing the node array 

        public static Node BuildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1){ // agar pehla node hi null hai to return null;
                return null;
            }


                // making the node by the node array
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            

             return newNode;
    }
}

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println(root.data); //1 

    }
}

