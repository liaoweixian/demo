import java.io.Console;

public class Program {

    public static void main(String[] args) {

        Console console = System.console();
        if (console != null) {
            console.format("fuck %s\n", "you");
        } else {
            System.out.println("没有console对象");
        }
    }
}
