class Solution {                                                    // java class
    public int maxProfit(int[] prices) {                            // method definition starts here
        
        int minprice = Integer.MAX_VALUE;                           // minprice holds the minimum value in the array
        int maxprofit = 0;                                          // maxprofit holds the maximum profit that we can get
        
        for (int i = 0; i<prices.length; i++){                      // to iterate the array
            if (prices[i] < minprice){                              // check for minimum values
                minprice = prices[i];                               // if found update minprice
            }
            else if (prices[i] - minprice >maxprofit){              // calculate profit and compare with maxprofit; if greater
                maxprofit = prices[i] - minprice;                   // update maxprofit
            }
        }
        return maxprofit;                                           // return the ans
    }
}
