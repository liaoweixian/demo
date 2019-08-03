package lang;

public class StringDemo {

    public static void main(String[] args) {
        String str = new String("qwert");
        String str1 = new String("qwert");
        String str2 = new String("QWERT");
        System.out.println(str.charAt(1));
        System.out.println(str.codePointAt(1));

        int i = str.compareTo(str1);
        System.out.println("compareTo:" + i);

        int i1 = str.compareToIgnoreCase(str2);
        System.out.println("compareToIgnoreCase:" + i1);

        String a = str2.concat("a");
        System.out.println(a);
        System.out.println(str2);

        StringBuffer buffer  = new StringBuffer("qwert");
        boolean b = str.contentEquals(buffer);
        System.out.println("contentEquals:" + b);

        char[] c = {'q','w'};

        String s = String.copyValueOf(c);
        System.out.println(s);

        boolean b1 = str.equalsIgnoreCase(str1);

        String string = new String("qqwwweeqrq");
        String replace = string.replace("q", "c");
        System.out.println(replace);

    }
}
