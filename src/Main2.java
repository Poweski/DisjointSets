public class Main2 {
    public static void main(String[] args) {

        Kindergarten kindergarten = new Kindergarten();

        kindergarten.addNewChild(0);
        kindergarten.addNewChild(1);
        kindergarten.addNewChild(2);
        kindergarten.addNewChild(3);

        System.out.println("False - " + kindergarten.doTheyKnowEachOther(0,1));

        kindergarten.unionChild(0,1);
        kindergarten.unionChild(2,3);

        System.out.println("True - " + kindergarten.doTheyKnowEachOther(0,1));
        System.out.println("True - " + kindergarten.doTheyKnowEachOther(2,3));
        System.out.println("False - " + kindergarten.doTheyKnowEachOther(0,2));

        kindergarten.unionChild(0,2);

        System.out.println("True - " + kindergarten.doTheyKnowEachOther(1,3));
    }
}
