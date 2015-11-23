public class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length,low=0,high=len-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target)
            high=mid-1;
            else if(nums[mid]<target)
            low=mid+1;
            else return mid;
        }
        return low;
    }
}
