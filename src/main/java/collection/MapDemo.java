package collection;

import domain.Student;

import java.util.*;

/**
 * 1、键值对映射 键是唯一的
 * 学习Map的主要实现集合 HashMap、LinkedHashMap、HashTable、WeakHashMap、SortedMap、TreeMap、IdentityHashMap
 */
public class MapDemo {

    public static void main(String[] args) {

        //hashMapDemo();

    }

    /**
     * TreeMap
     *
     */
    public static void treeMapDemo() {
        // 到这里了
        TreeMap<String, Student> stringStudentTreeMap = new TreeMap<>();

    }

    /**
     * WeakHashMap
     *
     */
    public static void weakHashMapDemo() {
        WeakHashMap<String, Student> stringStudentWeakHashMap = new WeakHashMap<>();
    }

    /**
     * HashTable
     * 1、不允许null键值
     */
    public static void hashTableDemo() {

    }

    /**
     * LinkedHashMap
     * 1、按照插入的顺序进行排序
     * 2、允许null
     * 3、实现hash加链表，链表保证了排序
     * 4、LinkedHashMap 继承自HashMap
     */
    public static void linkedHashMapDemo() {

        LinkedHashMap<String, Student> linkedHashMap = new LinkedHashMap<>();
        LinkedHashMap<Object, Object> objectObjectLinkedHashMap = new LinkedHashMap<>();
        /**
         * Constructor
         * 1、null构造
         * 2、初始容量
         * 3、初始容量、加载因子
         * 4、Map自类构造
         * 5、初始容量，负载因子和订购模式
         */
        LinkedHashMap<Object, Object> linkedHashMapA = new LinkedHashMap<>();
        LinkedHashMap<Object, Object> linkedHashMapB = new LinkedHashMap<>(10);
        LinkedHashMap<Object, Object> linkedHashMapC = new LinkedHashMap<>(10, 1);
        LinkedHashMap<Object, Object> linkedHashMapD = new LinkedHashMap<>(linkedHashMap);
        LinkedHashMap<Object, Object> linkedHashMapE = new LinkedHashMap<>(10, 1, true);

        objectObjectLinkedHashMap.put("q", new Student("又一", 1));
        objectObjectLinkedHashMap.put("w", new Student("又二", 2));
        objectObjectLinkedHashMap.put("e", new Student("又三", 3));
    }

    /**
     * HashMap
     * 1、能添加null键值
     * 2、底层实现是数组加链表，如果链表数大于8会转成红黑树，红黑树小于6会转会链表
     */
    public static void hashMapDemo() {

        HashMap<String, Student> hashmap = new HashMap<>();
        HashMap<String, Student> stringStudentHashMap = new HashMap<>();

        /**
         * Constructor
         * 1、null构造
         * 2、初始容量
         * 3、初始化容量和加载因子
         * 4、Map自类构造
         */
        HashMap<String, Student> hashMapA = new HashMap<>();
        HashMap<String, Student> hashMapB = new HashMap<>(10);
        HashMap<String, Student> hashMapC = new HashMap<>(10, 1);
        HashMap<String, Student> hashMapD = new HashMap<>(hashmap);

        stringStudentHashMap.put("q", new Student("又一", 1));
        stringStudentHashMap.put("w", new Student("又二", 2));
        stringStudentHashMap.put("e", new Student("又三", 3));

        //清除hashMap数据
        stringStudentHashMap.clear();
        System.out.println(stringStudentHashMap);

        //将键值添加到Map中去
        hashmap.put("q", new Student("又一", 1));
        hashmap.put("w", new Student("又二", 2));
        hashmap.put("e", new Student("又三", 3));
        hashmap.put("R", null);

        //判断是否包含指定的键
        boolean q = hashmap.containsKey("q");

        //判断是否包含指定的值
        boolean bool = hashmap.containsValue(new Student("又一", 1));
        System.out.println("iskey:" + q);
        System.out.println("isvalue:" + bool);

        //得到set
        Set<Map.Entry<String, Student>> entries = hashmap.entrySet();
        for (Map.Entry<String, Student> entry : entries) {

            System.out.println("key:" + entry.getKey());

            System.out.println("value:" + entry.getValue());
        }

        //以键去获取值
        Student q1 = hashmap.get("q");

        //获取键对应的值如果没有对应  返回之前设置的默认值
        Student orDefault = hashmap.getOrDefault("R", new Student("又四", 4));

        //判断Map是否包含键值映射
        System.out.println(hashmap.isEmpty());

        //获取所有的键
        Set<String> strings = hashmap.keySet();

        stringStudentHashMap.put("q", new Student("又一", 1));
        stringStudentHashMap.put("w", new Student("又二", 2));
        stringStudentHashMap.put("e", new Student("又三", 3));

        //将目标Map数据复制到当前Map
        hashmap.putAll(stringStudentHashMap);

        //判断键是否存在，存在看它关联的值是否为null 为null 创建值， 键不存在和put一样增加
        hashmap.putIfAbsent("r", new Student("又四", 4));
        hashmap.putIfAbsent("R", new Student("又四", 5));

        //删除这个键值对
        hashmap.remove("r");

        //按照键进行值的替换
        hashmap.replace("R", new Student("又四", 8));
        System.out.println(hashmap);
    }
}
