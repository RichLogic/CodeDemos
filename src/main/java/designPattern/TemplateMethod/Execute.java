package designPattern.Template;

public class Execute {

    public static void main(String[] args) {
        Display c = new CharDisplay('R');
        Display s = new StringDisplay("Hello world.");

        c.display();
        s.display();
    }
}
