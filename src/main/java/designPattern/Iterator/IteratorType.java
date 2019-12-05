package designPattern.iterator;

import java.util.*;

public class IteratorType implements Iterable {
    @Override
    public Iterator iterator() {
        return null;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        Spliterator<Integer> a = list.spliterator();
        Spliterator<Integer> b = a.trySplit();
        Spliterator<Integer> c = b.trySplit();

        System.out.println("a===============");
        a.forEachRemaining(System.out::println);
        System.out.println("b===============");
        b.forEachRemaining(System.out::println);
        System.out.println("c===============");
        c.forEachRemaining(System.out::println);
    }
}
