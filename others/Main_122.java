
public class Main_122 {
    public static main(String[] args){

    }
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i< prices.length; i++) {
            int diff = prices[i+1] - prices[i];
            if (diff > 0) res +=diff;
        }
        return res;
    }
}
