class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int curMin = 1, curMax = 1;

        for(int i=0 ; i<nums.length ; i++){
            int temp = curMax;
            curMax = Math.max(Math.max(curMax*nums[i], curMin* nums[i]), nums[i]);
            curMin = Math.min(Math.min(temp* nums[i], curMin*nums[i]), nums[i]);
            max = Math.max(curMax,max);
        }
        return max;
    }
}
