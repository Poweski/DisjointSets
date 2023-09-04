import java.util.ArrayList;

public class Kindergarten {
    private static class Child {
        private final ListSetElement label;

        public Child(int id) {
            this.label = new ListSetElement(id);
        }

        public ListSetElement getLabel() {
            return label;
        }
    }

    private final ListDisjointSet kinderGarden;
    private final ArrayList<Child> listOfChildren;

    public Kindergarten() {
        kinderGarden = new ListDisjointSet();
        listOfChildren = new ArrayList<>();
    }

    public void addNewChild(int name) {
        Child newChild = new Child(name);
        listOfChildren.add(newChild);
        kinderGarden.makeSet(newChild.getLabel());
    }

    public void unionChild(int name1, int name2) {
        kinderGarden.union(listOfChildren.get(name1).getLabel(), listOfChildren.get(name2).getLabel());
    }

    public boolean doTheyKnowEachOther(int name1, int name2) {
        return kinderGarden.findSet(listOfChildren.get(name1).getLabel()) == kinderGarden.findSet(listOfChildren.get(name2).getLabel());
    }

    public static void printChildList(ArrayList<Child> children) {

        for (Child child : children)
            System.out.println(child.getLabel());

        System.out.println();
    }
}
