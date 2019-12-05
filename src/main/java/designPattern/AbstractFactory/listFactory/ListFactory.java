package designPattern.AbstractFactory.listFactory;

import designPattern.AbstractFactory.factory.Factory;
import designPattern.AbstractFactory.factory.Link;
import designPattern.AbstractFactory.factory.Page;
import designPattern.AbstractFactory.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
