package neetcode.array.sliding.window;

class BuyStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currProfit = 0;

        int left = 0, right = 1;

        while (left < right && left < prices.length && right < prices.length) {
            if(prices[left] < prices[right]) {
                currProfit = Math.max((prices[right] - prices[left]), currProfit);
            }
            if(prices[left] >= prices[right]) {
                left++;
            }
            maxProfit = Math.max(currProfit, maxProfit);
            right++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] {2,1,2,1,0,1,2};
        BuyStock buyStock = new BuyStock();
        System.out.println(buyStock.maxProfit(prices));
    }
}
