package designPattern.Bridge;

public class StringDisplay implements IDisplay {

    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.length();
    }

    @Override
    public void rawOpen() {
        this.printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void rawClose() {
        this.printLine();
    }

    private void printLine() {

        System.out.print("+");
        int i = 0;
        while (i++ < width)
            System.out.print("-");
        System.out.println("+");

    }
}
