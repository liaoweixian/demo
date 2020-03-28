package java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class LocalDateTest {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now :" + now);
        LocalDate of = LocalDate.of(2020, 1, 1);
        System.out.println("of: " + of);
        LocalDate parse = LocalDate.parse("2020-01-01");
        System.out.println("parse:" + parse);
        LocalDate withFirstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("with -> firstDayOfMonth :" + withFirstDayOfMonth);
        LocalDate withFirstDayOfNextMonth = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("with -> firstdayOfMonth : " + withFirstDayOfNextMonth);
        LocalDate withLastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("with -> lastdayOfMonth :" + withLastDayOfMonth);
        LocalDate withDayOfMonth = now.withDayOfMonth(2);
        System.out.println("withDayOfMonth : " + withDayOfMonth);
        LocalDate plusDays = withLastDayOfMonth.plusDays(1);
        System.out.println("获取下一天 plusDays ：" + plusDays);

        LocalDate now1 = LocalDate.now();
        System.out.println("atStartOfDay :" + now1.atStartOfDay());

        System.out.println("----: " + now1.toEpochDay());

        LocalDateTime atTime = now1.atTime(22, 50, 59);
        System.out.println("atTime :" + atTime);

        System.out.println(LocalDate.ofYearDay(2018, 15));

        Date date = new Date();
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        System.out.println(localDateTime);
        System.out.println(now1.toEpochDay());
    }
}
