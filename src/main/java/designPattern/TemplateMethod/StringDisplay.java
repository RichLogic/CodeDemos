package designPattern.Template;

public class StringDisplay extends Display {

    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.length();
    }

    @Override
    public void open() {
        this.printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        this.printLine();
    }

    private void printLine() {

        System.out.print("+");

        int i = 0;
        while (i++ < this.width)
            System.out.print("-");

        System.out.println("+");

    }
}
