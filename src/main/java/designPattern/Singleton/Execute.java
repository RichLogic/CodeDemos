package designPattern.Singleton;

public class Execute {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(s1 == s2);
        System.out.println(o1 == o2);

    }

}
