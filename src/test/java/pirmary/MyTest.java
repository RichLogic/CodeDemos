package pirmary;

import org.junit.Test;

public class MyTest {

    @Test
    public void test() {
        int h;
        String key = "name";
        System.out.println((h = key.hashCode()) ^ (h >>> 16));
    }


    @Test
    public void testConstructer() {
        A ab = new B();
        ab = new B();
    }

}

class A {
    static {
        System.out.print("1");
    }
    public A() {
        System.out.print("2");
    }
}

class B extends A{
    static {
        System.out.print("a");
    }
    public B() {
        System.out.print("b");
    }
}
