package lang;

public class IntegerDemo {

    public static void main(String[] args) {

        Integer integer = new Integer("12334");
        System.out.println(integer.byteValue());

        System.out.println(integer.compareTo(123));

        int i = Integer.compareUnsigned(1, 2);
    }
}
