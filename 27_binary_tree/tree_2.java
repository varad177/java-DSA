//traversing in the tree

// there are some rules 
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class tree_2 {

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

    // traversal in in order
    // 1=> PreOrder Traversal
    // in this
    // 1) root
    // 2) left subtree
    // 2) right subtree

    // isme ham left ko priority dete hai
    // it is called pre prder because here root comes first (pre)
    // so the time comprexity => o(n)

    public static void PreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    // traversal in in order
    // 2=> inorder
    // 1) left sun tree
    // 2) root
    // 3) right sub tree

    // in this we first print the left value
    // we will print the root at the middle
    // and the then we will print the all right sub tree value
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // traversal in post order
    // 3=> post order
    // 1) left sub tree
    // 2) right sub tree
    // 3) root

    // in this we first print the left sub tree
    // then right sub tree
    // then root

    public static void PostOrder(Node root) {
        if (root == null) {
            return;
        }

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }

    // level order
    // 4=> level order traversal
    // in this node will be printed in the level wise
    // above traversal method we used recursion but in this we will use iteration
    // also for level order we used the data structure named as queue
    // queue will use for using the fifo property
    // here we also used the BFS i.e breath first search

    public static void LevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curNode = q.remove();

            if (curNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");
                if (curNode.left != null) {
                    q.add(curNode.left);
                }
                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println("Traversal By Pre-Order");
        PreOrder(root);
        System.out.println();

        System.out.println("Traversal By In-Order");
        inOrder(root);
        System.out.println();

        System.out.println("Traversal by Post-Order");
        PostOrder(root);
        System.out.println();

        System.out.println("Traversal by level-Order");
        LevelOrder(root);
        System.out.println();


    }

}
