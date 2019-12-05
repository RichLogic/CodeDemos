package leetcode.easy;

public class Subject122 {

    public int maxProfit(int[] prices) {

        int benefit = 0;

        for(int i=0; i<prices.length-1; i++)
            if (prices[i+1] > prices[i])
                benefit += (prices[i+1] - prices[i]);

        return benefit;
    }

}
