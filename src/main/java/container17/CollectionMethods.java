package container17;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionMethods {

    public static void main(String[] args) {
        /*ArrayList<String> c = new ArrayList<>();
        c.add("ten");
        c.add("eleven");
        System.out.println(c);
        Object[] objects = c.toArray();
        String[] str = c.toArray(new String[0]);
        System.out.println(objects.length);
        System.out.println(str.length);

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("one");
        c.addAll(c2);
        System.out.println(c);
        c.retainAll(c2);
        System.out.println(c);*/

        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy", new ArrayList<String>(list));
        test("Arrays.asList", list);
    }

    static void test(String msg, List<String> list) {

        System.out.println("--------" + msg + "------");
        Collection<String> c = list;
        List<String> subList = list.subList(1, 8);
        ArrayList<String> c2 = new ArrayList<>(subList);
        try
        {
            c.retainAll(c2);
        }
        catch (Exception e)
        {
            System.out.println("retainAll" + e);
        }

        try
        {
            c.removeAll(c2);
        }
        catch (Exception e)
        {
            System.out.println("removeAll" + e);
        }

        try
        {
            c.clear();
        }
        catch (Exception e)
        {
            System.out.println("clear" + e);
        }

        try
        {
            c.add("X");
        }
        catch (Exception e)
        {
            System.out.println("add" + e);
        }

        try
        {
            c.addAll(c2);
        }
        catch (Exception e)
        {
            System.out.println("addAll" + e);
        }

        try
        {
            c.remove("C");
        }
        catch (Exception e)
        {
            System.out.println("remove" + e);
        }

        try
        {
            list.set(0, "X");
        }
        catch (Exception e)
        {
            System.out.println("set" + e);
        }


    }
}
