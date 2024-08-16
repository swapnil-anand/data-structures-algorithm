package arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] stockPrices = {1,5,3,8,12};
        int totalProfit = findTotalStockProfit(stockPrices);
        System.out.println(totalProfit);
    }

    public static int findTotalStockProfit(int[] stockPrice) {
        int profit = 0;
        for (int i = 1; i < stockPrice.length; i++) {
            if (stockPrice[i] > stockPrice[i - 1])
                profit += (stockPrice[i] - stockPrice[i - 1]);
        }
        return profit;
    }
}
