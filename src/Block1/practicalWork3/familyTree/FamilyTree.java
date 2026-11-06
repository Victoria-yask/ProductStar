package Block1.practicalWork3.familyTree;

public class FamilyTree {
    private FamilyMember root;

    public FamilyTree(FamilyMember root) {
        this.root = root;
    }

    public void printTree() {
        root.printNodes(0);
    }

    //поиск всех родственников
    public void findRelatives(String name) {
        FamilyMember result = root.findNode(name);

        if (result == null) {
            System.out.println("Человек " + name + " не найден");
            return;
        }

        System.out.println("\n--- Родственники для " + name + " ---");

        // поиск родителей
        System.out.print("Родители: ");
        if (result.getParents().isEmpty()) {
            System.out.print("нет");
        } else {
            for (FamilyMember p : result.getParents()) {
                System.out.print(p.getName() + " ");
            }
        }
        System.out.println();

        // поиск детей
        System.out.print("Дети: ");
        if (result.getChildren().isEmpty()) {
            System.out.print("нет");
        } else {
            for (FamilyMember c : result.getChildren()) {
                System.out.print(c.getName() + " ");
            }
        }
        System.out.println();

        System.out.print("Внуки: ");
        boolean hasGrandchildren = false;
        for (FamilyMember c : result.getChildren()) {
            for (FamilyMember grandchild : c.getChildren()) {
                System.out.print(grandchild.getName() + " ");
                hasGrandchildren = true;
            }
        }
        if (!hasGrandchildren) System.out.print("нет");
        System.out.println();


    }
}