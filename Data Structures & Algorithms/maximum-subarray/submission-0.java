class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int temp = 0;
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i ; j<nums.length ; j++){
                for(int k=i ; k<=j ; k++){
                    temp += nums[k];
                }
                if(max < temp)
                    max = temp;
                temp = 0;
            }
        }
        return max;
    }
}
