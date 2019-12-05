package designPattern.adapter.condition2;

// Print 是类，对于 Banner 只能用 组合
public class PrintBanner extends Print {

    private Banner banner;

    PrintBanner(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        System.out.println(banner.withParen());
    }

    @Override
    public void printStrong() {
        System.out.println(banner.withAster());
    }
}