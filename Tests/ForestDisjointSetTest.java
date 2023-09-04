import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ForestDisjointSetTest {

    private ForestDisjointSet disjointSet;
    private ForestSetElement element1;
    private ForestSetElement element2;
    private ForestSetElement element3;

    @BeforeEach
    public void setUp() {
        disjointSet = new ForestDisjointSet();
        element1 = new ForestSetElement(1);
        element2 = new ForestSetElement(2);
        element3 = new ForestSetElement(3);
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
