package ClassMessage;

public class ClassLoad {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("ClassMessage.Load1");

        Class load2Class = Load2.class;
    }
}
class Load1 {
    static {
        System.out.println("Load1");
    }
}
class Load2 {
    static {
        System.out.println("Load2");
    }
}
