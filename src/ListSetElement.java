public class ListSetElement {
    private ListSetElement nextElement;
    private ListSetElement representative;
    private ListSetElement lastElement;
    private final int id;
    private int length;

    public ListSetElement(int id) {
        this.id = id;
    }

    public ListSetElement getLastElement() {
        return lastElement;
    }
    public ListSetElement getNextElement() {
        return nextElement;
    }
    public ListSetElement getRepresentative() {
        return representative;
    }
    public int getLength() {
        return length;
    }
    public int getId() {
        return id;
    }
    public void setRepresentative(ListSetElement representative) {
        this.representative = representative;
    }
    public void setLastElement(ListSetElement lastElement) {
        this.lastElement = lastElement;
    }
    public void setNextElement(ListSetElement nextElement) {
        this.nextElement = nextElement;
    }
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString()
    {
        StringBuilder string = new StringBuilder("");

        if (this == representative)
        {
            ListSetElement actual = representative;

            while (actual != null)
            {
                string.append(actual.getId()).append(" -> ");
                actual = actual.getNextElement();
            }

            string.append("null");
            return string.toString();
        }

        string.append(id);
        return  string.toString();
    }
}