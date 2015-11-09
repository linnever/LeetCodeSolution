public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length,i=0,j=len-1;
         int[] result = {-1,-1};
         while(i<j){
             int mid=(i+j)>>1;
             if(nums[mid]<target)
             i=mid+1;
             else
             j=mid;
         }
         if(nums[i]!=target) return result;
         else result[0]=i;
         j=len-1;
          while (i < j)
          {
          int mid = (i + j) /2 + 1;   // Make mid biased to the right
          if (nums[mid] > target) 
          j = mid - 1;
          else i = mid;               // So that this won't make the search range stuck.
    }
    result[1] = j;
    return result; 
    }
}