package demo;

public interface DemoInterface {
    void add();
    void delete();
}

abstract class  DemoAbstract implements DemoInterface {
    @Override
    public void add() {
        System.out.println("这是一个增加方法");
    }
}

class Experiment extends DemoAbstract{
    @Override
    public void delete() {
        System.out.println("这个是删除");
    }

    public static void main(String[] args) {
        System.out.println("这样是可以实现的");
    }
}