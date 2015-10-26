/*Search Insert Position 
Given a sorted array and a target value, return the index if the target is found. If not, 
return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0*/

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length,low = 0,high = len - 1;
        while(low <= high){
        	//low < higt is not correct ! if nums[1]={1}, target = 2 then it'll return 0,but the excepted is 1;
            int mid = low + (high - low) / 2;
            //mid = (low + high) / 2 ..
            //if low and high are very big,this line will cause overflow errror...
            if(nums[mid] > target)
            high = mid - 1;
            else if(nums[mid] < target)
            low = mid + 1;
            else return mid;
        }
        return low;
    }
}