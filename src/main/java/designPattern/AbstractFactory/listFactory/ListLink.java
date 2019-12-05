package designPattern.AbstractFactory.listFactory;

import designPattern.AbstractFactory.factory.Link;

public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    protected String makeHtml() {
        return "<a>" + url + "</a>";
    }
}
