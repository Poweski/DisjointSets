import java.util.LinkedList;

public class ForestDisjointSet {
    LinkedList<ForestSetElement> setsRepresentatives = new LinkedList<>();

    public void makeSet(ForestSetElement element) {
        element.setParent(element);
        element.setRank(0);
        setsRepresentatives.add(element);
    }

    public void union(ForestSetElement firstElement, ForestSetElement secondElement) {
        firstElement = findSet(firstElement);
        secondElement = findSet(secondElement);
        int value;
        if ((value = firstElement.getRank() - secondElement.getRank()) < 0) {
            ForestSetElement tmp = firstElement;
            firstElement = secondElement;
            secondElement = tmp;
        }
        if (value == 0) {
            firstElement.setRank(firstElement.getRank() + 1);
        }
        secondElement.setParent(firstElement);
    }

    public ForestSetElement findSet(ForestSetElement element) {
        if (element == element.getParent()) {
            return element;
        }
        ForestSetElement representative = findSet(element.getParent());
        element.getParent().setRank(0);
        representative.setRank(element.getRank() + 1);
        element.setParent(representative);
        return representative;
    }
}
