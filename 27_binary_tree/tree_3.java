// ccount of node

public class tree_3 {

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

    public static int CountOfNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int leftNode = CountOfNodes(root.left);
        int rightNode = CountOfNodes(root.right);

        return leftNode + rightNode + 1;
    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println("no of nodes are " + CountOfNodes(root));
        // time c is o(n)

    }
}