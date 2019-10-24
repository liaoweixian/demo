package container17;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 使用生成器，实现填充 Generator
 */
public class CollectionDataTest {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<String>(new Goverment(), 15));
        set.addAll(CollectionData.list(new Goverment(), 15));
        System.out.println(set);
    }

}

class Goverment implements Generator<String> {

    String[] foundation = ("strange woment lying in ponds distributing swords is no basis for a system of government").split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[this.index++];
    }
}

