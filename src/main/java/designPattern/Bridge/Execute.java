package designPattern.Bridge;

public class Execute {

    public static void main(String[] args) {

        Display d1 = new Display(new StringDisplay("Hello, world."));
        Display d2 = new CountDisplay(new StringDisplay("Hello, world!"));
        CountDisplay d3 = new CountDisplay(new StringDisplay("Hello, world?"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }

}
