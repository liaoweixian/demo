package ClassMessage;

public class ToyTest {

    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + "is interface? [" + cc.isInterface() +"]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class cc = null;
        try {
            cc = Class.forName("ClassMessage.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(cc);
        for (Class face : cc.getInterfaces()) {
            printInfo(face);
        }
        Class up = cc.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        }
        printInfo(obj.getClass());
        printInfo(up);
    }

}

interface HasBatteries {

}

interface Waterproof {

}

interface Shoots {

}

class Toy {

    public Toy() {
    }

    public Toy(int i) {

    }
}

class FancyToy extends Toy implements  HasBatteries, Waterproof, Shoots {
    public FancyToy() {
        super(1);
    }
}

