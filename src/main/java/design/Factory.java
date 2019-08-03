package design;

public class Factory {
}

/**
 * 简单工厂模式
 * 工厂模式在进行扩展的时候会违背“开闭原则”
 *  优点
 *      1、根据外界给定的信息创建具体的产品
 *      2、将产品的创建从“消费”对象里脱离出来，便于对产品生产的扩展。
 *      3、“消费”与“产品”低耦合
 *      4、“消费”只要知道怎么创建“产品”，无需知道“产品”具体创建过程
 *  缺点
 *      1、破环了开闭原则，添加新的“产品”需要修改工厂
 */
class SimpleFactory {
    public static Fruit newInstance(String type) {
        Fruit fruit = null;
        if (type.equals("apple")) {
            fruit = new Apple();
        } else if(type.equals("banana")) {
            fruit = new Banana();
        }
        return  fruit;
    }
    public static void main(String[] args) {
        Fruit fruit = newInstance("apple");
        fruit.eat();
    }
}
interface Fruit {
    void eat();
}
class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
class Banana implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
}

/**
 * 工厂方法模式
 * 与简单工厂模式相比，创建产品对象的工厂接口，将产品对象的实例创建工作推迟到具体的子类工厂。这样满足创建模式中要求的“创建与产品分离”的效果，同时也不违背“开闭原则”。
 * 简单工厂和工厂方法都是生成一类产品，同等级的产品（一个类型的产品）。
 * 优点：
 *  1、约定熟成，消费者只需要知道具体工厂的名字就可以创建具体的“产品”。
 *  2、添加新产品只需要添加对应的工厂接口，代码便于扩展。
 *  缺点：
 *      1、每增加一个产品，就需要添加一个相应的工厂，增加了系统的复杂度。
 *
 */
interface FactoryInterface {
    Fruit newInstance();
}
class AppleFactory implements FactoryInterface {
    @Override
    public Fruit newInstance() {
        return new Apple();
    }
}
class BananaFactory implements FactoryInterface {
    @Override
    public Fruit newInstance() {
        return new Banana();
    }
}
/**
 * 抽象工厂模式
 *  抽象工厂模式考虑的是产品族的生产，现实生活中，电器厂它生产电视、洗衣机、空调，这些都是产品，但是是不同的产品类，他们是在同一个电器厂生产，这就是产品族。
 *  它是工厂方法模式的升级版，
 *  使用抽象工厂模式要满足以下条件：
 *      1、系统中有多个产品族，每个具体工厂创建一个产品族但属于不同等级结构的产品。
 *      2、消费者一次只能消费某一族产品，同族产品一起使用。
 *   具有工厂方法模式的优点外，还有一下优点：
 *      1、可以在类的内部对产品族进行管理。
 *      2、添加新的产品族，直接进行扩展。
 *  缺点：
 *      1、产品族添加一个新产品，所有的工厂都要进行需改
 */
interface AppliancesFactory {
    WashingMachine newWashingMachine();
    Printer newPrinter();
}
interface WashingMachine {
    void washing ();
}
interface Printer {
    void println();
}
class GeLiWashingMachine implements WashingMachine {
    @Override
    public void washing() {
        System.out.println("格力空调");
    }
}
class GeLiPrinter implements Printer {
    @Override
    public void println() {
        System.out.println("格力打印机");
    }
}
class MeiDiWashingMachine implements WashingMachine {
    @Override
    public void washing() {
        System.out.println("美的空调");
    }
}
class MeiDiPrinter implements Printer {
    @Override
    public void println() {
        System.out.println("美的打印机");
    }
}
class GeLiFactory implements AppliancesFactory {
    @Override
    public WashingMachine newWashingMachine() {
        return new GeLiWashingMachine();
    }

    @Override
    public Printer newPrinter() {
        return new GeLiPrinter();
    }
}

