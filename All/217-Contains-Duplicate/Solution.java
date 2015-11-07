public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hm=new HashSet<Integer>();
        if (nums.length==0) {
            return false;
        }
        int size=nums.length;
        for (int i = 0; i < size; i++) {
            if (!hm.contains(nums[i])) {
                hm.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}