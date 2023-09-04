import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListDisjointSetTest {

    private ListDisjointSet disjointSet;
    private ListSetElement element1;
    private ListSetElement element2;
    private ListSetElement element3;

    @BeforeEach
    public void setUp() {
        disjointSet = new ListDisjointSet();
        element1 = new ListSetElement(1);
        element2 = new ListSetElement(2);
        element3 = new ListSetElement(3);
    }

    @Test
    public void testMakeSet() {
        disjointSet.makeSet(element1);
        disjointSet.makeSet(element2);
        disjointSet.makeSet(element3);

        assertEquals(element1, element1.getRepresentative());
        assertEquals(element2, element2.getRepresentative());
        assertEquals(element3, element3.getRepresentative());
    }

    @Test
    public void testUnion() {
        disjointSet.makeSet(element1);
        disjointSet.makeSet(element2);
        disjointSet.makeSet(element3);

        disjointSet.union(element1, element2);

        assertEquals(element1.getRepresentative(), element2.getRepresentative());

        disjointSet.union(element2, element3);

        assertEquals(element2.getRepresentative(), element3.getRepresentative());
        assertEquals(element1.getRepresentative(), element3.getRepresentative());
    }

    @Test
    public void testFind() {
        disjointSet.makeSet(element1);
        disjointSet.makeSet(element2);
        disjointSet.makeSet(element3);

        disjointSet.union(element1, element2);
        disjointSet.union(element2, element3);

        assertEquals(element3.getRepresentative(), disjointSet.findSet(element1));
        assertEquals(element3.getRepresentative(), disjointSet.findSet(element2));
        assertEquals(element3.getRepresentative(), disjointSet.findSet(element3));
    }
}
