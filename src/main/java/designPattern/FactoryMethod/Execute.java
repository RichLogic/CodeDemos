package designPattern.FactoryMethod;

public class Execute {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product c1 = factory.create("a");
        Product c2 = factory.create("b");
        Product c3 = factory.create("c");

        c1.use();
        c2.use();
        c3.use();
    }
}
