import domain.Student;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //Demo.stringBufferDemo();
        //fileDemo();
       // pathDemo();
        //arraysDemo();
        ArrayList<Student> strings = new ArrayList<>();
        strings.add(new Student("哈哈", 1));
        strings.add(new Student("wwww", 2));
        strings.add(new Student("eeee", 3));
        strings.add(new Student("rrrr", 4));
        Iterator<Student> iterator = strings.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            next.setName("111111111");
        }
        System.out.println(strings);
    }

    public static void arraysDemo() {

        List<String> strings = Arrays.asList("a", "b", "c", "c");
        System.out.println(strings);

        int arrayi[] = {2,3,4,5,6,1};
        String arrayStr[] = {"a","c","d","e"};
        //二分查找 需要排序
        int a = Arrays.binarySearch(arrayi, 1);
        System.out.println(a);

        int[] ints = Arrays.copyOf(arrayi, arrayi.length + 1);
        //排序 按数字顺序排序
        Arrays.sort(ints);
        for (int i : ints) {
            System.out.println(i);
        }


        //深度比较
        String[] strings1 = Arrays.copyOf(arrayStr, arrayStr.length);
        System.out.println(Arrays.deepEquals(arrayStr,strings1));


    }

    public static void hashMapDemo() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("aaa", "aaa");
        map.put("bbb", "bbb");
        map.put("fff", "fff");
        map.put("mmm", "mmm");
        map.put("ggg", "ggg");
       /* HashMap<String, String> hsh= (HashMap<String, String>)((HashMap<String, String>) map).clone();
        map.clear();
        System.out.println(map);
        System.out.println(hsh);*/
        System.out.println(map.containsKey("aaa"));
        System.out.println(map.containsValue("ggg"));
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println("key: " + next.getKey());
            System.out.println("value: " + next.getValue());
        }
        System.out.println("get:" + map.get("aaa"));
        System.out.println("isEmpty(): " + map.isEmpty());
    }

    public static void stringBufferDemo() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("qwe");
        buffer.append("rrrr");
        buffer.append("tttt");
        System.out.println(buffer);
        System.out.println(buffer.charAt(1));
        StringBuffer delete = buffer.delete(0, 2);
        System.out.println(delete);
        System.out.println(buffer);
    }

    public static void fileDemo() {
        File file = new File("C:\\Users\\96593\\test\\demo.txt");
        System.out.println("测试是都可以执行此路径的文件" + file.canExecute());
        System.out.println("是否可以读取" + file.canRead());
        System.out.println("是否可以写入" + file.canWrite());
        try {
            System.out.println("创建文件" + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件或目录是否存在：" + file.exists());
        System.out.println("文件或目录的名称：" + file.getName());
        System.out.println("是否为目录：" + file.isDirectory());
        System.out.println("是否为文件：" + file.isFile());

        /**
         * 转成Path对象
         */

    }

    public static void pathDemo() {
        File file = new File("C:\\Users\\96593\\test");
        Path path = file.toPath();
        System.out.println("是否以给定的路径结束：" + path.endsWith("demo.txt"));
        Iterator<Path> iterator = path.iterator();
        while (iterator.hasNext()) {
            Path next = iterator.next();
            System.out.println(next);
        }
    }


}
