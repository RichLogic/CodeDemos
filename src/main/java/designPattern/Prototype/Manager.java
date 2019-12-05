package designPattern.Prototype;

import java.util.HashMap;

public class Manager {

    private HashMap<String, Product> show = new HashMap<>();

    public void register(String name, Product proto) {
        show.put(name, proto);
    }

    public Product create(String protoName) {
        Product product = show.get(protoName);
        return product.createClone();
    }

}
