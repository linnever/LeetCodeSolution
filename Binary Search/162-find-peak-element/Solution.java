public class Solution {
    public int findPeakElement(int[] nums) {
        int len=nums.length,min=nums[0],index=0;
        for(int i=0;i<len;i++){
            if(nums[i]>min){
                min=nums[i];
                index=i;
            }
        }
        return index;
    }
}
