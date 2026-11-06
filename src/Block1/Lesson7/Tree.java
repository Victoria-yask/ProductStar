package Block1.Lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree {
    public TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return root.toString();
    }
    // ПОИСК УЗЛА (Два метода: обертка и рекурсия)
    public TreeNode findNodeByValue(String value) {
        return findNodeByValue(root, value);
    }

    private TreeNode findNodeByValue(TreeNode currentNode, String value) {
        if (currentNode == null) {
            return null;
        }

        // Если нашли совпадение
        if (currentNode.getValue().equals(value)) {
            return currentNode;
        }

        // Ищем в детях
        for (TreeNode child : currentNode.getChildren()) {
            TreeNode result = findNodeByValue(child, value);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    // УДАЛЕНИЕ УЗЛА (Безопасное через Iterator)
    public boolean deleteNode(String value) {
        if (root == null) return false;

        // Если нужно удалить сам корень (очищаем дерево)
        if (root.getValue().equals(value)) {
            root = null;
            return true;
        }

        return deleteNode(root, value);
    }

    private boolean deleteNode(TreeNode currentNode, String value) {
        Iterator<TreeNode> iterator = currentNode.getChildren().iterator();

        while (iterator.hasNext()) {
            TreeNode child = iterator.next();

            // Если нашли нужного ребенка
            if (child.getValue().equals(value)) {
                iterator.remove();
                return true;
            }

            // Если не нашли, идем глубже в его детей
            if (deleteNode(child, value)) {
                return true;
            }
        }
        return false;
    }


    // ВНУТРЕННИЙ КЛАСС УЗЛА
    public static class TreeNode {
        private String value;
        private List<TreeNode> children;

        public TreeNode(String value) {
            this.value = value;
            this.children = new ArrayList<>();
        }

        public void addChild(TreeNode child) {
            this.children.add(child);
        }

        public List<TreeNode> getChildren() {
            return children;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            // Сначала собираем строки всех детей
            if (children != null && !children.isEmpty()) {
                for (TreeNode treeNode : children) {
                    sb.append(treeNode.toString());
                }
            }

            // Формируем HTML-подобный вывод узла
            return "\n<" + value + ">" + sb.toString() + "\n</" + value + ">";
        }
    }

    // ЗАПУСК ПРОГРАММЫ (MAIN)
    public static void main(String[] args) {
        // 1. Создаем узлы
        TreeNode rootNode = new TreeNode("html");
        TreeNode headNode = new TreeNode("head");
        TreeNode bodyNode = new TreeNode("body");
        TreeNode titleNode = new TreeNode("title");
        TreeNode divNode = new TreeNode("div");
        TreeNode pNode = new TreeNode("p");
        TreeNode h1Node = new TreeNode("h1");

        // 2. Строим дерево
        rootNode.addChild(headNode);
        rootNode.addChild(bodyNode);

        headNode.addChild(titleNode);

        bodyNode.addChild(divNode);
        bodyNode.addChild(h1Node);

        divNode.addChild(pNode);

        // 3. Оборачиваем в класс Tree
        Tree tree = new Tree(rootNode);

        // 4. Выводим начальное дерево
        System.out.println("Исходное дерево:");
        System.out.println(tree);
        System.out.println("=====================");

        // 5. Тестируем поиск
        TreeNode foundNode = tree.findNodeByValue("body");
        System.out.println("Найденный узел (и его ветка):");
        System.out.println(foundNode);
        System.out.println("=====================");

        // 6. Тестируем удаление (удаляем div)
        boolean result = tree.deleteNode("div");
        System.out.println("Удаление узла 'div' прошло успешно? " + result);

        // 7. Выводим дерево после удаления
        System.out.println("Дерево после удаления:");
        System.out.println(tree);
    }
}
