import java.util.LinkedList;

public class ListDisjointSet
{
    LinkedList<ListSetElement> setsRepresentatives = new LinkedList<>();

    public void makeSet(ListSetElement setElement) {
        setElement.setRepresentative(setElement);
        setElement.setLastElement(setElement);
        setsRepresentatives.add(setElement);
        setElement.setLength(1);
    }

    public void union(ListSetElement firstElem, ListSetElement secondElem) {

        ListSetElement firstRepresentative = firstElem.getRepresentative();
        ListSetElement secondRepresentative = secondElem.getRepresentative();

        if (firstRepresentative.getLength() < secondRepresentative.getLength()) {
            ListSetElement tmp = firstRepresentative;
            firstRepresentative = secondRepresentative;
            secondRepresentative = tmp;
        }

        firstRepresentative.getLastElement().setNextElement(secondRepresentative);
        firstRepresentative.setLastElement(secondRepresentative.getLastElement());
        secondRepresentative.setLastElement(null);
        firstRepresentative.setLength(firstRepresentative.getLength() + secondRepresentative.getLength());
        ListSetElement actualElementInSecondSet = secondRepresentative;

        while (actualElementInSecondSet != null) {
            actualElementInSecondSet.setRepresentative(firstRepresentative);
            actualElementInSecondSet = actualElementInSecondSet.getNextElement();
        }

        setsRepresentatives.remove(secondRepresentative);
    }

    public ListSetElement findSet(ListSetElement element) {
        return element.getRepresentative();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        for (ListSetElement representative : setsRepresentatives) {
            string.append(representative).append('\n');
        }

        return string.toString();
    }
}
