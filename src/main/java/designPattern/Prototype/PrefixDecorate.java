package designPattern.Prototype;

public class PrefixDecorate implements Product {

    private char c;

    public PrefixDecorate (char c) {
        this.c = c;
    }

    @Override
    public void use(String str) {
        System.out.println(c + str);
    }

    @Override
    public Product createClone() {

        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
