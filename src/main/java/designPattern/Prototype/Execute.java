package designPattern.Prototype;

public class Execute {

    public static void main(String[] args) {

        Product a = new SuffixDecorate('~');
        Product b = new PrefixDecorate('!');
        Product c = new PrefixDecorate('@');

        Manager manager = new Manager();
        manager.register("~", a);
        manager.register("!", b);
        manager.register("@", c);

        manager.create("~").use("Go");
        manager.create("!").use("Go");
        manager.create("@").use("Go");
    }

}
