package designPattern.Strategy;

public class Hand {

    public static final int STONE = 0;
    public static final int SCISSOR = 1;
    public static final int CLOTH = 2;
    public static final Hand[] HANDS = {
            new Hand(STONE),
            new Hand(SCISSOR),
            new Hand(CLOTH),
    };

    public static final String[] name = {"石头", "剪刀", "布"};

    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return HANDS[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand)
            return 0;
        else if ((this.handValue + 1) % 3 == hand.handValue)
            return 1;
        else
            return -1;
    }

}
