package InsdeClass;

/**
 * 成员内部类
 */
public class OuterClass {

    private String str;

    public static String name = "chenssy";

    public void outerDisplay() {
        System.out.println("outerClass.....");
    }

    public class InnerClass2{
        public String _name2 = "chenssy_inner";
        public void innerDisplay() {
            str = "chenssy.....";
            System.out.println("innerClass.....");
            System.out.println(str);
            OuterClass.this.outerDisplay();
        }

        public void display(){
            System.out.println("OuterClass name：" + name);
        }
    }

    public InnerClass2 getInnerClass() {
        return new InnerClass2();
    }

    /**
     *静态内部类
     */
    static class InnerClass1{
        /* 在静态内部类中可以存在静态成员 */
        public static String _name1 = "chenssy_static";

        public static void display(){
            /*
             * 静态内部类只能访问外围类的静态成员变量和方法
             * 不能访问外围类的非静态成员变量和方法
             */
            System.out.println("OutClass name :" + name);
        }
    }

    /**
     * @desc 外围类方法
     * @author chenssy
     * @data 2013-10-25
     * @return void
     */
    public void display(){
        /* 外围类访问静态内部类：内部类. */
        System.out.println(InnerClass1._name1);
        /* 静态内部类 可以直接创建实例不需要依赖于外围类 */
        InnerClass1.display();

        /* 非静态内部的创建需要依赖于外围类 */
        OuterClass.InnerClass2 inner2 = new OuterClass().new InnerClass2();
        /* 方位非静态内部类的成员需要使用非静态内部类的实例 */
        System.out.println(inner2._name2);
        inner2.display();
    }

    public static void main(String[] args) {
        /*OuterClass outerClass = new OuterClass();
        InnerClass2 innerClass = outerClass.new InnerClass2();
        innerClass.innerDisplay();*/

        OuterClass outer = new OuterClass();
        outer.display();
    }

}
