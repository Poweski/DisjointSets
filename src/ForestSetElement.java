public class ForestSetElement {
    private ForestSetElement parent;
    private int rank;
    private final int id;

    public ForestSetElement(int id) {
        this.id = id;
    }

    public ForestSetElement getRepresentative() {
        ForestSetElement actual = this;
        while (actual != actual.getParent()) {
            actual = actual.getParent();
        }
        return actual;
    }
    public void setParent(ForestSetElement _parent) {
        this.parent = _parent;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public ForestSetElement getParent() {
        return parent;
    }
    public int getRank() {
        return rank;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(id + "");

        if (this == this.getParent()) {
            return id + " -> end";
        }

        string.append(" -> ").append(this.getParent());
        return string.toString();
    }
}
