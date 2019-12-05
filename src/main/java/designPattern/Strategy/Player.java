package designPattern.Strategy;

public class Player {

    private String name;
    private Strategy strategy;


    public Player(Strategy strategy) {
        this.strategy = strategy;
    }
}
