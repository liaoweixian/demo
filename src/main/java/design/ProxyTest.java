package design;

import java.io.Serializable;

/**
 * 代理模式
 * 代理模式就像是现实生活中的中介，通过中介来完成一些本身想要做的事情并添加一些扩展，而当扩展不用时可以直接去掉，也不会影响自己本身的业务。比如12306火车票的代售点。
 *  优点：
 *  1、客户端与目标对象之起到一个中介作用，起到保护目标对象的作用。
 *  2、代理可以对目标类进行扩展，并不会影响目标类原有代码，符合“开闭原则”。
 *  3、代理能够使客户端和目标对象分离，减低了对象之间的耦合度。
 *  缺点：
 *      增加了系统的复杂度，但是便于扩展一些特殊业务，或者一些临时业务的需求。
 *  在Java中api使有专门做代理的工具库Proxy;同时也有第三方包CGLIB
 */
public class ProxyTest { //客户端
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
interface Subject { //抽象主题
    void request();
}
class RealSubject implements Subject {  //具体主题
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
class Proxy implements Subject { //代理
    private Subject subject ;
    @Override
    public void request() { //具体代理实现  功能加强
        if (subject == null) {
            subject = new RealSubject();
        }
        preRequest();
        subject.request();
        endRequest();
    }
    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }
    public void endRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}

class proxy<T> implements Serializable {
    private T obj;
    public proxy(T obj) {
        this.obj = obj;
    }
    @Override
    public String toString() {
        return obj.toString();
    }
}
