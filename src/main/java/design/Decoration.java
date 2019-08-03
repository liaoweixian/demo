package design;


/**
 * 装饰模式
 * 它是一种对象结构形模式，它的目的主要是在不改变对象原有代码的情况下对类的一些动作进行增强。
 *  优点：
 *  1、对代码进行增强，不需要改变原有结构
 *  2、相对来说比继承灵活
 *  缺点：
 *   1、增加了代码结构的复杂度
 * 结构：
 *  1、增强类和被增强类要实现同一个接口。
 *  2、增强类里面要引用指向被增强类（聚合关系）
 */
public class Decoration {
    public static void main(String[] args) {
        Component p=new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d=new ConcreteDecorator(p);
        d.operation();
    }
}
interface Component { //抽象构件
    void operation();
}
class ConcreteComponent  implements Component { //具体构件
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }
    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
class Decorator implements Component { //抽象装饰
    private Component component;
    public Decorator(Component component) {
        this.component=component;
    }
    @Override
    public void operation() {
        component.operation();
    }
}
class ConcreteDecorator  extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }
    public void operation() {
        super.operation();
        addedFunction();
    }
    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}

