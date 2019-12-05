package designPattern.AbstractFactory.listFactory;

import designPattern.AbstractFactory.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        return null;
    }

}
