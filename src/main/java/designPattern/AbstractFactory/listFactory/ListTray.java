package designPattern.AbstractFactory.listFactory;

import designPattern.AbstractFactory.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    protected String makeHtml() {
        return null;
    }

}
