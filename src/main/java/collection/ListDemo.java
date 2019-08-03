package collection;

import domain.Student;

import java.io.Serializable;
import java.util.*;
import java.util.function.Predicate;

/**
 * 1、该界面的用户可以精确控制列表中每个元素的插入位置。 用户可以通过整数索引（列表中的位置）访问元素，并搜索列表中的元素。
 * 2、许重复的元素（列表通常允许元素e1和e2成对使得e1.equals(e2) ）
 *
 * 学习List的主要实现集合 ArrayList、Vector、Stack、AbstractSequentialList、LinkedList
 */
public class ListDemo implements Serializable {

    public static void main(String[] args) {
        //arrayListDemo();
        //vectorDemo();
        stackDemo();
    }

    /**
     * Stack
     * 1、扩展了Vector类， 多了五个方法， 实现FIFO 先进先出
     */
    public static void stackDemo() {

        /**
         * Constructor
         * 1、null构造
         */
        Stack<Student> students = new Stack<>();

        //将数据放到集合的首位
        students.push(new Student("又一",1));
        students.push(new Student("又二",2));

        System.out.println(students);
        System.out.println(students.empty());
        System.out.println(students.peek());
        System.out.println(students.pop());
        System.out.println(students);
    }

    /**
     * Vector
     * 1、和ArrayList一样，这个是同步的，ArrayList不是同步
     */
    public static void vectorDemo() {
        Vector<Student> students = new Vector<>();

        /**
         * Constructor
         * 1、null构造
         * 2、以Collection子类实例
         * 3、初始化容量
         * 4、指定的初始容量和容量增量的空向量。
         */
        Vector<Student> studentsA = new Vector<>();
        Vector<Student> studentsB = new Vector<>(students);
        Vector<Student> studentsC = new Vector<>(5);
        Vector<Student> studentsD = new Vector<>(5, 2);

        //add(E) 在集合的最后添加元素
        students.add(new Student("又一",1));
        students.add(new Student("又二",2));
        students.add(new Student("又三",3));
        studentsA.add(new Student("又五",5));
        studentsA.add(new Student("又六",6));
        students.add(new Student("又六",6));

        //add(index , E) 在指定位置插入元素
        //插入下班不存在会报下标越界
        students.add(1, new Student("又四", 4));

        //把整个Collection的集合数据添加到此集合的尾部
        students.addAll(studentsA);

        //整个Collection的集合数据插入到指定位置
        students.addAll(0, studentsA);

        //把元素添加到集合末尾
        students.addElement(new Student("又七",7));

        //查询指定的元素是否存在 使用的是对象的equals进行比较查找
        boolean bool = students.contains(new Student("又一", 1));
        System.out.println("contains:" + bool);

        //获取索引处的元素
        Student student = students.elementAt(0);

        //返回此向量的组件的枚举。
        Enumeration<Student> elements = students.elements();
       /* while (elements.hasMoreElements()) {
            Student student1 = elements.nextElement();
            System.out.println(student1);
        }*/


        System.out.println(student);
        System.out.println(students);
    }

    /**
     * ArrayList
     * 1、可调整大小的的数组实现
     * 2、并允许所有元素，包括null
     * 3、该size，isEmpty，get，set，iterator和listIterator操作在固定时间内运行
     * 4、add操作以摊余常数运行 ，即添加n个元素需要O（n）个时间
     * 5、不同步 ，同步需要用Collections进行包装
     */
    public static void arrayListDemo() {

        ArrayList<Student> students = new ArrayList<>();
        /**
         * Constructor
         * 1、null构造
         * 2、以Collection子类实例
         * 3、初始化容量
         */
        ArrayList<Student> studentsA = new ArrayList<>();
        ArrayList<Student> studentsB = new ArrayList<>(students);
        ArrayList<Student> studentsC = new ArrayList<>(10);

        //add(E) 在集合的最后添加元素
        students.add(new Student("又一",1));
        students.add(new Student("又二",2));
        students.add(new Student("又三",3));
        studentsA.add(new Student("又五",5));
        studentsA.add(new Student("又六",6));
        students.add(new Student("又六",6));


        //add(index , E) 在指定位置插入元素
        //插入下班不存在会报下标越界
        students.add(1, new Student("又四", 4));

        //把整个Collection的集合数据添加到此集合的尾部
        students.addAll(studentsA);

        //清除集合数据
        studentsC.clear();

        //浅拷贝 把集合的数据地址拷贝一份 形成一个新的集合返回 要想是深拷贝 泛型对象必须实现Cloneable接口
        ArrayList<Student> studentList = (ArrayList<Student>)students.clone();

        //获取指定下标元素
        Student student = studentList.get(0);

        //查询指定的元素是否存在 使用的是对象的equals进行比较查找
        boolean bool = students.contains(new Student("又一", 1));
        System.out.println("contains:" + bool);


        //判断集合是否为空 内部计数器为0代表为空
        System.out.println("isEmpty: " + students.isEmpty());

        /**
         * 遍历器
         * list集合有两个遍历器 Iterator、ListIterator
         * 两个最大的区别，前者只能先向前进行遍历，后者不但可以向前也可以向后遍历
         */
        Iterator<Student> iterator = students.iterator();
        ListIterator<Student> studentListIterator = students.listIterator();

        //删除
        studentList.remove(new Student("又一",1));
        studentList.remove(0);

        //按条件进行删除
        //Predicate接口其实就是做过滤的 Lambda语法实现
        //studentList.removeIf( (value) -> { return value.getName().indexOf("又") >= 0 ? true : false; });

        Student youba = new Student("又八", 8);
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(youba);

        //只保存指定集合中的数据 如果指定集合数据在本集合中不存在 当前集合就会为空
        studentList.retainAll(students1);

        //用指定的元素替换当前元素，并把当前元素返回
        students.set(0, new Student("又九", 9));

        //返回集合元素个数
        System.out.println(students.size());

        //排序
        students.sort((o1, o2) -> { return o1.getAge().compareTo(o2.getAge()); });

        //按照下表截取数据形成一个新的集合
        List<Student> students2 = students.subList(0, 3);
        System.out.println(students2);

        students.trimToSize();

        student.setName("取出的数据");
        System.out.println(studentList);
        System.out.println(students);

    }
}
