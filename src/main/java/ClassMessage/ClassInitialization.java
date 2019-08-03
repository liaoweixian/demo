package ClassMessage;

import java.util.Random;

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");

        System.out.println(Initable.staticFinal3);
       /* System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class aClass = Class.forName("ClassMessage.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);*/
    }
}

class Initable {
    static final int staticFinal = 47;
    static final String staticFinal3 = "qqq";
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }

    public static final int deppoints() {
        return 55;
    }
}

class Initable2 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}
