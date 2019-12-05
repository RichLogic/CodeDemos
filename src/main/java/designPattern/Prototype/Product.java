package designPattern.Prototype;

public interface Product extends Cloneable {

    void use(String str);

    Product createClone();

}
