package designPattern.Builder;

public abstract class Builder {

    abstract Builder makeTitle(String title);

    abstract Builder makeString(String str);

    abstract Builder makeItems(String[] items);

    abstract void build();

}