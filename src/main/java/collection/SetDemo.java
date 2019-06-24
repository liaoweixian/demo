package collection;

import domain.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 1、不包含重复元素e1.equals(e2)
 * 2、最多一个空元素
 * 学习List的主要实现集合 AbstractSet、HashSet、LinkedHashSet、SortedSet、TreeSet
 */
public class SetDemo {

    public static void main(String[] args) {
        hashSetDemo();
    }
    /**
     * LinkedHashSet
     * 1、哈希表和链表实现了Set接口
     *
     */
    public static void linkedHashSetDemo() {

        LinkedHashSet<Student> students = new LinkedHashSet<>();

        /**
         * Constructor
         * 1、null构造
         * 2、Collection子类构造
         *  * 4、初始容量和加载因子构造
         * 5、初始容量和负载因子
         */
        LinkedHashSet<Student> studentsA = new LinkedHashSet<>();
        LinkedHashSet<Student> studentsB = new LinkedHashSet<>(students);
        LinkedHashSet<Student> studentsC = new LinkedHashSet<>(10);
        LinkedHashSet<Student> studentsD = new LinkedHashSet<>(10, 1);

        /**
         * 方法和其他set一样的 ， 没有去重写过方法
         */
    }

    /**
     * HashSet
     * 1、由hash表支持
     * 2、集合的迭代次序不作任何保证，它不能保证订单在一段时间内保持不变
     * 3、允许null元素
     * 4、不同步
     *
     */
    public static void hashSetDemo() {

        HashSet<Student> students = new HashSet<>();

        /**
         * Constructor
         * 1、null构造
         * 2、Collection子类构造
         * 3、初始容量构造
         * 4、初始容量和加载因子构造
         * 5、底层实现是以是把元素作为HashMap的键来实现
         */
        HashSet<Student> studentsA = new HashSet<>();
        HashSet<Student> studentsB = new HashSet<>(students);
        HashSet<Student> studentsC = new HashSet<>(10);
        HashSet<Student> studentsD = new HashSet<>(10,1);

        //往集合添加元素
        students.add(new Student("又一",1));
        students.add(new Student("又二",2));
        students.add(null);
        //清空集合
        //students.clear();

        //判断元素是否存在该集合
        boolean bool = students.contains(new Student("又一", 1));
        System.out.println("contains:" + bool);

        //判断集合是否为空
        System.out.println(students.isEmpty());

        //删除集合元素
        boolean remove = students.remove(new Student("又一", 1));
        System.out.println("remove:" + remove);


        System.out.println(students);
    }
}
