package ClassMessage;

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class aClass = Class.forName("ClassMessage.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find Gum");
        }
        System.out.println("After Class.forName(Gum)");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}

class Candy {

    static {
        System.out.println("Loding Candy");
    }
}

class Gum {

    static {
        System.out.println("Loding Gum");
    }
}

class Cookie {

    static {
        System.out.println("Loding Cookie");
    }
}