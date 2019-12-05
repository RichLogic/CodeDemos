package time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class TimeTest {

    @Test
    public void timeTest() {
//        System.out.println(LocalDate.now().getDayOfWeek().getValue());
//        System.out.println(LocalDate.now().getDayOfMonth());
//        System.out.println(LocalDate.now().getDayOfYear());
//        System.out.println(LocalDate.now().getMonth());
//        System.out.println(LocalDate.now().getMonthValue());
//        System.out.println(LocalDate.now().getDayOfWeek().plus(2));
//        System.out.println(LocalDate.of(2019, 6, 1).with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)));

//        System.out.println(LocalTime.now());

        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");



        System.out.println(String.join(",", list));

    }
}
