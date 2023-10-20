//diameter of tree

// there are two cases
/// first the lenght passes through the root 
// second length is not passes through the root 

// there are two approaches 
// 1=> o(N^2)
//

public class tree_6 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree {

        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }

    }

    public static int Height(Node root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        int MyHeight = Math.max(leftHeight, rightHeight) + 1;
        return MyHeight;
    }

    // the time complexity is O(N^2)
    public static int Diameter(Node root) {

        if (root == null) {
            return 0;
        }

        int diam_1 = Diameter(root.left);
        int diam_2 = Diameter(root.right);

        int diam_3 = Height(root.left) + Height(root.right) + 1;
        return Math.max(diam_3, Math.max(diam_1, diam_2));

    }

    // the the complexity is o(n)

    // for that we are making the class x

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;

        }
    }

    public static TreeInfo Diameter2(Node root) {
        if(root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = Diameter2(root.left);
        TreeInfo right = Diameter2(root.right);

        int MyHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);
        TreeInfo myInfo = new TreeInfo(MyHeight, myDiam);
        return myInfo;

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println("the diameter of tree is " + Diameter(root)); //5
        System.out.println("the diameter is "+ Diameter2(root).diam); //5

    }
}
