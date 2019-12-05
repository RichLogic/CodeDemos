package designPattern.Bridge;

public class CountDisplay extends Display {

    public CountDisplay(IDisplay display) {
        super(display);
    }

    public void multiDisplay(int times) {

        open();

        for (int i=0; i<times; i++)
            print();

        close();
    }
}
