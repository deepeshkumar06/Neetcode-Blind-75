class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    search(nums, target) {
        var l = 0;
        var r = nums.length - 1;

        while(l <= r){
            var mid = Math.floor(( l + r )/2);
            if(target == nums[mid])
                return mid;

            //Left sort
            if(nums[l] <= nums[mid]){
                if(target < nums[l] || target > nums[mid])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
            //Right sort
            else{
                if(target < nums[mid] || target > nums[r])
                    r = mid - 1;
                else
                    l = mid + 1;
            }
        }
        return -1;
    }
}
