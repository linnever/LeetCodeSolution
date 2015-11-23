public class Solution {
    public int findMin(int[] nums) {
        int len = nums.length ,min=nums[0];
        if (len == 1) {
            return nums[0];
        }
        for (int i = 1; i < len; i++) {
            if (min >= nums[i]) {
                min=nums[i];
            }
        }
        return min;
    }
}
