//its runtime is 2ms. 
//Time complexity:O(N) Space:O(N)
public class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer>list=new ArrayList<Integer>();
        int length=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val)
            length--;
            else
            list.add(nums[i]);
        }
        for(int i=0;i<length;i++)
        nums[i]=list.get(i);
        return length;
    }
}

//there is a better way.its runtime is 1ms
//Time complexity:O(N) Space:O(1)
public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0)
        return 0;
        int corse=0;
        for(int index=0;index<nums.length;index++){
            if(nums[index]==val)
            continue;
            else 
            nums[corse++]=nums[index];
        }
            return corse;
    }
}
//best way ? its runtime is 0ms and it's clean!!!
public class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int n:nums)
        if(n!=val)
        nums[index++]=n;
        return index;
    }
}