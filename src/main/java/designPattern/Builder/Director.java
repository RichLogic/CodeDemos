package designPattern.Builder;

// 这个不是常用的 builder builder 太常用了，就不写了
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

//    class builder() {
//
//    }

    public void construct() {
        builder.makeTitle("Greeting").makeString("morning -> noon").makeItems(new String[]{"Good morning!", "Good noon!"}).build();
    }

}
