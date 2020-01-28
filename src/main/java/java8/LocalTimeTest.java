package java8;

import java.time.LocalTime;

public class LocalTimeTest {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime withNano = LocalTime.now().withNano(0);
        System.out.println("now :" + now);
        System.out.println("withNano :" + withNano);
        LocalTime of = LocalTime.of(0, 0, 0);
        LocalTime parse = LocalTime.parse("12:00:00");
        System.out.println("of :" + of);
        System.out.println("parse : " + parse);
    }
}
