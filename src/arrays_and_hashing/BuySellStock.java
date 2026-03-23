package arrays_and_hashing;

public class BuySellStock {
     public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            profit=Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
    public static void main(String[] args) {
        BuySellStock    bs=new  BuySellStock();
        int[]   nums={7,1,5,3,6,4};
        System.out.println(bs.maxProfit(nums));
    }
}
