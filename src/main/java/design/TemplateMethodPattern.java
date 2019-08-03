package design;

/**
 * 模板方法模式
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        AbstractClass concreateClass = new ConcreateClass();
        concreateClass.templateMethod();
    }
}

abstract class AbstractClass {  //模板类

    public void templateMethod() { //模板方法
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void specificMethod() { //具体类
        System.out.println("抽象类中的具体方法被调用...");
    }

    public abstract void abstractMethod1();  //抽象方法

    public abstract void abstractMethod2();  //抽象方法
}

class ConcreateClass extends AbstractClass {

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法1的实现被调用...");
    }
}
