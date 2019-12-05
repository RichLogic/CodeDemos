package designPattern.adapter.condition2;

class Banner {

    String str;

    Banner(String str) {
        this.str = str;
    }

    String withParen() {
        return "(" + this.str + ")";
    }

    String withAster() {
        return "*" + str + "*";
    }
}
