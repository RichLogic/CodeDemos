package designPattern.FactoryMethod;

public class IDCardProduct extends Product {

    private String owner;

    public IDCardProduct(String owner) {
        System.out.println("制作" + owner + "的 ID 卡");
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    void use() {
        System.out.println("使用" + owner + "的 ID 卡");
    }

}
