package designPattern.Prototype;

public class SuffixDecorate implements Product {

    private char c;

    public SuffixDecorate(char c) {
        this.c = c;
    }

    @Override
    public void use(String str) {
        System.out.println(str + c);
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
