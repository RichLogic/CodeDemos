package designPattern.FactoryMethod;

public abstract class Factory {

    public final Product create(String owner) {

        Product product = createProduct(owner);
        registerProduct(product);

        return product;
    }


    abstract Product createProduct(String owner);

    abstract void registerProduct(Product product);

}