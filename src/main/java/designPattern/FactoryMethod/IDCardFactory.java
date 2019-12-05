package designPattern.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    Product createProduct(String owner) {
        return new IDCardProduct(owner);
    }

    @Override
    void registerProduct(Product idCard) {
        owners.add(((IDCardProduct)idCard).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
