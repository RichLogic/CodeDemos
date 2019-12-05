package designPattern.Bridge;

public class Display {

    private IDisplay display;

    public Display(IDisplay display) {
        this.display = display;
    }

    public void open() {
        display.rawOpen();
    }

    public void print() {
        display.rawPrint();
    }

    public void close() {
        display.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }


}
