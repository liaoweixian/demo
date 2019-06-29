package dstatic;

public class Table {

    public static Bow1 bow1 = new Bow1(1);

    public Table() {
        System.out.println("Table()");
        bow2.f1(1);
    }

    public void f2(int marker) {
        System.out.println("f2("+ marker +")");
    }

    public static Bow1 bow2 = new Bow1(2);

}
