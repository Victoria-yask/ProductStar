package Block1.Lesson7;

public class BinaryTree {
    private Node root;

    public void add(int value) {
        root = Node.addNode(root, value);
    }

    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("Дерево пустое");
        }
        return Node.findMinNode(root);
    }


    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.value + " ");
            printInOrder(node.right);
        }
    }

    public void printAll() {
        printInOrder(root);
        System.out.println();
    }

    static class Node {
        int value; // Значение узла
        Node left; // Левый дочерний узел
        Node right; // Правый дочерний узел

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public static Node addNode(Node current, int value) {
            if (current == null) {
                return new Node(value);
            }
            if (value < current.value) {
                current.left = addNode(current.left, value); // Добавляем в левое поддерево
            } else if (value > current.value) {
                current.right = addNode(current.right, value); // Добавляем в правое поддерево
            }
            return current;
        }

        public static int findMinNode(Node current) {
            return current.left == null ? current.value : findMinNode(current.left);
        }

    }

        public static void main(String[] args) {
            BinaryTree binaryTree = new BinaryTree();
            binaryTree.add(50);
            binaryTree.add(30);
            binaryTree.add(70);
            binaryTree.add(20);
            binaryTree.add(40);
            binaryTree.add(60);
            binaryTree.add(80);

            binaryTree.printAll();
            System.out.println("Минимальное значение: " + binaryTree.findMin());

        }

}


