package Block1.practicalWork3.familyTree;
import java.util.ArrayList;
import java.util.List;
/*
Создайте класс FamilyMember для представления члена семьи в генеалогическом дереве.
Реализуйте методы:
addChild(String name) — добавление ребенка;
addParent(String name) — добавление родителя;
findRelatives(String name) — поиск всех родственников;
printTree() — вывод дерева.
 */

public class FamilyMember {
    private String name;
    private List<FamilyMember> parents;
    private List<FamilyMember> children;

    public FamilyMember(String name) {
        this.name = name;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public List<FamilyMember> getParents() { return parents; }
    public List<FamilyMember> getChildren() { return children; }

    // добавление ребенка
    public FamilyMember addChild(String name) {
        FamilyMember child = new FamilyMember(name);
        child.parents.add(this);
        this.children.add(child);
        return child;
    }

    // Добавление родителя
    public FamilyMember addParent(String name) {
        FamilyMember parent  = new FamilyMember(name);
        parent.children.add(this);
        this.parents.add(parent );
        return parent ;
    }

    //печать всех узлов
    // передаем уровень (0 - корень, 1 - дети, 2 - внуки)
    public void printNodes(int level) {
        // отступ в зависимости от уровня (2 пробела на уровень)
        String indent = "  ".repeat(level);

        String result = name;

        // поиск второго родителя
        if (!children.isEmpty()) {
            FamilyMember firstChild = children.get(0);
            for (FamilyMember parent : firstChild.parents) {
                if (parent != this) {
                    result += " ─ " + parent.name;
                    break;
                }
            }
        }
        System.out.println(indent + result);

        for (FamilyMember child : children) {
            child.printNodes(level + 1);
        }
    }

    // поиск узла
    public FamilyMember findNode(String name) {
        return findNode(name, null); //
    }

    // рекурсивный метод
    private FamilyMember findNode(String name, FamilyMember caller) {
        if (this.name.equals(name)) {
            return this;
        }

        // Ищем внищ (среди детей)
        for (FamilyMember child : children) {
            if (child != caller) {
                FamilyMember result = child.findNode(name, this);
                if (result != null) return result;
            }
        }

        // Ищем вверх (среди родителей)
        for (FamilyMember parent : parents) {
            if (parent != caller) {
                FamilyMember result = parent.findNode(name, this);
                if (result != null) return result;
            }
        }

        return null;
    }


    public static void main(String[] args) {
        /*
 [Иван (Отец)] ─ [Мария (Мать)]
             │
  [Петр (Сын)] ─ [Лиза]
             │
     [Олег (Внук)]
         */

        FamilyMember ivan = new FamilyMember("Иван");
        FamilyMember petr = ivan.addChild("Петр");
        petr.addParent("Мария");
        FamilyMember oleg = petr.addChild("Олег");
        oleg.addParent("Лиза");

        FamilyTree tree = new FamilyTree(ivan);

        System.out.println("--- Дерево ---");
        tree.printTree();

        System.out.println("\n--- Поиск родственников ---");
        tree.findRelatives("Олег");
    }
}


