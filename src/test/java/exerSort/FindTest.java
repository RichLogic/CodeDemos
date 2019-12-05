package exerSort;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FindTest {
    @Test
    public void test() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        Assert.assertEquals(2, Find.binaryFind(array, 3));

        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new LinkedHashMap<>();
        Map<String, String> map3 = new TreeMap<>();
        Map<String, String> map4 = new ConcurrentHashMap<>();
        Set<String> set = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();


        Thread t = new Thread(() -> System.out.println(1));
        t.start();

    }


}
