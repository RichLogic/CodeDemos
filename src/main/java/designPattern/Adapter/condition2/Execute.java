package designPattern.adapter.condition2;

public class Execute {

    public static void main(String[] args) {

        Print print = new PrintBanner("Go");
        print.printWeak();
        print.printStrong();

    }

}
