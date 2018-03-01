package maxheap;

public class Heap {

    Node root;

    Heap() {

    }

    Node maxHeapInsert(int data) {
        if (root == null) {
            root = new Node();
            root.data = data;
        } else {
            if (data > root.data) {
                Node tmp = new Node();
                tmp.data = data;
                tmp.right = root;
                root = tmp;
            } else {
                root.left = new Node();
                root.data = data;
            }
        }
        return root;
    }

    void printPostOrder(Node node) {
        if (node == null) {
            System.out.println("hi1");
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
        System.out.println("h");
    }

    void printInOrder(Node node) {
        if (node == null) {
            System.out.println("hi2");
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        System.out.println();
        printInOrder(node.right);
    }

    void printPreOrder(Node node) {
        if (node == null) {
            System.out.println("hi3");
            return;
        }
        System.out.print(node.data + " ");
        System.out.println();
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
}
