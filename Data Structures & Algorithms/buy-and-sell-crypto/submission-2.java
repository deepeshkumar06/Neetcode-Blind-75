class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1, max = 0, n = 0, i = 0;
        while(i < prices.length-1){
            n = prices[right] - prices[left];
            if(n >= 0 ){
                if(max < n){
                    max = n;
                }
                right++;
            }
            else{
                left = right;
                right++;
            }
            i++;
        }
        return max;
    }
}
