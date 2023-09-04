import java.util.ArrayList;

public class Main {
    public static ListDisjointSet listSet = new ListDisjointSet();
    public static ForestDisjointSet forestSet = new ForestDisjointSet();
    public static ArrayList<ListSetElement> allListElements = new ArrayList<>();
    public static ArrayList<ForestSetElement> allForestElements = new ArrayList<>();

    public static void main(String[] args) {

//        int counter = 0;
//
//        while (counter < 10)
//        {
//            ListSetElement newListSetElem = new ListSetElement(counter);
//            ForestSetElement newForestSetElem = new ForestSetElement(counter++);
//
//            allListElements.add(newListSetElem);
//            listSet.makeSet(newListSetElem);
//
//            allForestElements.add(newForestSetElem);
//            forestSet.makeSet(newForestSetElem);
//        }

//        printTreeForAllElements(allForestElements);
//
//        forestSet.union(allForestElements.get(3), allForestElements.get(4));
//        forestSet.union(allForestElements.get(1), allForestElements.get(2));
//        forestSet.union(allForestElements.get(1), allForestElements.get(3));
//        forestSet.union(allForestElements.get(6), allForestElements.get(7));
//        forestSet.union(allForestElements.get(8), allForestElements.get(1));
//        printTreeForAllElements(allForestElements);
//
//        System.out.println(forestSet.find(allForestElements.get(4)));
//        System.out.println();
//
//        System.out.println(forestSet.find(allForestElements.get(8)));
//        System.out.println();

//        printListForAllElements(allListElements);
//
//        listSet.union(allListElements.get(3), allListElements.get(4));
//        listSet.union(allListElements.get(1), allListElements.get(2));
//        listSet.union(allListElements.get(1), allListElements.get(3));
//        listSet.union(allListElements.get(6), allListElements.get(7));
//        listSet.union(allListElements.get(8), allListElements.get(1));
//        printListForAllElements(allListElements);
//
//        System.out.println(listSet.find(allListElements.get(4)));
//        System.out.println();
//
//        System.out.println(listSet.find(allListElements.get(8)));

//        int[] ranges = new int[]{ 100, 500, 1000, 1500, 2000, 3000, 4000, 5000, 6000, 7000, 8000 };
//
//        System.out.print("\nList:");
//        for (int range : ranges)
//            calculateListTime(range);
//        System.out.print("\n\nForest:");
//        for (int range : ranges)
//            calculateForestTime(range);
    }

    public static void calculateListTime(int range)
    {
        listSet = new ListDisjointSet();
        allListElements = new ArrayList<>();
        long time1, time2;

        System.out.println("\n" + range);

        time1 = System.nanoTime();
        for (int i = 0; i < range; i++)
        {
            ListSetElement newListSetElem = new ListSetElement(i);
            allListElements.add(newListSetElem);
            listSet.makeSet(newListSetElem);
        }
        time2 = System.nanoTime();
        System.out.println("MakeSet: " + (time2-time1)/1000);

        time1 = System.nanoTime();
        for (int i = 0; i < range; i++)
            listSet.findSet(allListElements.get(i));
        time2 = System.nanoTime();
        System.out.println("Find: " + (time2-time1)/1000);

        time1 = System.nanoTime();
        for (int i = 0; i < range; i+=2)
            listSet.union(allListElements.get(i), allListElements.get(i+1));
        time2 = System.nanoTime();
        System.out.println("Union: " + (time2-time1)/1000);
    }

    public static void calculateForestTime(int range)
    {
        forestSet = new ForestDisjointSet();
        allForestElements = new ArrayList<>();
        long time1, time2;

        System.out.println("\n" + range);

        time1 = System.nanoTime();
        for (int i = 0; i < range; i++)
        {
            ForestSetElement newForestSetElem = new ForestSetElement(i);
            allForestElements.add(newForestSetElem);
            forestSet.makeSet(newForestSetElem);
        }
        time2 = System.nanoTime();
        System.out.println("MakeSet: " + (time2-time1)/1000);

        time1 = System.nanoTime();
        for (int i = 0; i < range; i++)
            forestSet.findSet(allForestElements.get(i));
        time2 = System.nanoTime();
        System.out.println("Find: " + (time2-time1)/1000);

        time1 = System.nanoTime();
        for (int i = 0; i < range; i+=2)
            forestSet.union(allForestElements.get(i), allForestElements.get(i+1));
        time2 = System.nanoTime();
        System.out.println("Union: " + (time2-time1)/1000);
    }

    public static void printTreeForAllElements(ArrayList<ForestSetElement> elements)
    {
        for (ForestSetElement elem : elements)
            System.out.println(elem);

        System.out.println();
    }

    public static void printListForAllElements(ArrayList<ListSetElement> elements)
    {
        for (ListSetElement elem : elements)
            System.out.println(elem);

        System.out.println();
    }
}