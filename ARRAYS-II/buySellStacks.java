//ONE TRANSCTION- means find the maximum profit by choosing one day to buy and one day to sell later//
// public class buySellSatcks{

//     public static int bss(int prices[]){
//         int buyPrice=Integer.MAX_VALUE;
//         int maxProfit=0;

//         for(int i=0;i<prices.length;i++){
//             if(buyPrice<prices[i]){
//                 int profit=prices[i]-buyPrice;
//                 maxProfit=Math.max(maxProfit, profit);
//             }
//             else{
//                 buyPrice=prices[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String[]args){
//         int prices[]={7,1,5,3,6,4};
//         System.out.println(bss(prices));
//     }
// }

//MULTIPLE TRANSCTIONS- "buy-sell multiple times"- whenever today's price is greater than yesterday it means we can buy yesterday and sell today to make profit
public class buySellSatcks{
    public static int bass(int prices[]){
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[]args){
        int prices[]={100, 180, 260, 310, 40, 535, 695};
        System.out.println(bass(prices));
    }
}