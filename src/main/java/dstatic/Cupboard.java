package dstatic;

public class Cupboard {

      Bow1 bow13 =   new Bow1(3);

      public static Bow1 bow14 = new Bow1(4);

      public Cupboard() {
          System.out.println("Cupboard()");
          bow14.f1(2);
      }

      public void f3(int marker) {
          System.out.println("f3("+ marker +")");
      }

      public static Bow1 bow15 = new Bow1(5);
}
