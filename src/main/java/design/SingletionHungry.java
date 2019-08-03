package design;


/**
 * 饿汉式单例
 */
public class SingletionHungry {

    private static SingletionHungry singletionHungry = new SingletionHungry();

    private SingletionHungry() {

    }

    public static SingletionHungry getInstance() {
        return singletionHungry;
    }

    public static void main(String[] args) {
        SingletionHungry instance = SingletionHungry.getInstance();
    }
}

/**
 * 懒汉式单例
 */
class SingletionLazy {

    private static SingletionLazy singletionLazy = null;

    private SingletionLazy() {

    }

    public static SingletionLazy getInstance() {

        if (singletionLazy == null) {
            singletionLazy = new SingletionLazy();
        }
        return  singletionLazy;
    }

}
