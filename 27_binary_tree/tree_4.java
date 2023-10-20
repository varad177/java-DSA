//sum of nodes 

// t c is o(n)
public class tree_4 {

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

    public static int SumOfNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int leftsum = SumOfNodes(root.left);
        int rightsum = SumOfNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println("Sum of nodes are " + SumOfNodes(root));
        

    }
}