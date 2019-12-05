package designPattern.Adapter.condition1;

public class PrintBanner extends Banner implements Print {

    PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        System.out.println(super.withParen());
    }

    @Override
    public void printStrong() {
        System.out.println(super.withAster());
    }
}
