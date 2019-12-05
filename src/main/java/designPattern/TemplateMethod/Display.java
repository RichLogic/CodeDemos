package designPattern.Template;

public abstract class Display {

    void display() {

        open();

        int i = 0;
        while (i++ < 5)
            print();

        close();
    }

    abstract void open();

    abstract void print();

    abstract void close();

}
