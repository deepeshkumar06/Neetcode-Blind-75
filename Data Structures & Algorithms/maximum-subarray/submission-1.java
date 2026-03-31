class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int temp = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(temp < 0){
                temp = 0;
            }
            temp += nums[i];
            if(temp > max)
                max = temp;
        }
        return max;
    }
}
