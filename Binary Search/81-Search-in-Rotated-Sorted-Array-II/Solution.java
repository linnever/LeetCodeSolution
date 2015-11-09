//Cheating way
public class Solution {
    public boolean search(int[] nums, int target) {
        int len=nums.length;
        if(len==0)
        return false;
        for(int i=0;i<len;i++){
            if(nums[i]==target)
            return true;
        }
        return false;
    }
    }
//Binary search
