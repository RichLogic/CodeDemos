package designPattern.AbstractFactory.factory;

public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    protected abstract String makeHtml();

}
