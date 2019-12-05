package designPattern.Adapter.condition1;

public class Execute {

    public static void main(String[] args) {

        Print print = new PrintBanner("Go");
        print.printWeak();
        print.printStrong();

    }

}
