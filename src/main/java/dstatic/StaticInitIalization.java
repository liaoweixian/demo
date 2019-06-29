package dstatic;

public class StaticInitIalization {

    public static void main(String[] args) {
        System.out.println("creatin new Cupboard() ni main");
        new Cupboard();
        System.out.println("create new Cuboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    public static Table table = new Table();

    public static Cupboard cupboard = new Cupboard();
}
