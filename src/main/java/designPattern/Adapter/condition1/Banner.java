package designPattern.Adapter.condition1;

public class Banner {

    String str;

    public Banner(String str) {
        this.str = str;
    }

    String withParen() {
        return "(" + this.str + ")";
    }

    String withAster() {
        return "*" + str + "*";
    }
}
