//Time complexity:O(N) Space:O(1)
public class Solution {
    public int removeDuplicates(int[] nums) {
        int Numslength=nums.length;
        if(Numslength<2)
        return Numslength;

        int index=1;
        int temp=nums[0];
        for(int i=1;i<Numslength;i++){
            if(nums[i]!=temp){
                temp=nums[i];
                nums[index++]=nums[i];
            }
            }
            return index;
        }
}

//previous solution can be refactoring.And I thought this way is more readability than the later one 
public int removeDuplicates(int[] nums) {
    if(nums.length<2)
    return nums.length;
    int result=0;
    for(int index=1; index< nums.length; index++){
        if(nums[index]==nums[result]){
            continue;
        }
        else{
            nums[++result]=nums[index];
        }
    }
    return result+1;
}
//or
public int removeDuplicates(int[] nums) {
    if(nums.length<2)
    return nums.length;
    int result=0;
    for(int index=1; index< nums.length; index++){
        if(nums[index]!=nums[result]){
            nums[++result]=nums[index];
        }
    }
    return result+1;
}

//clean way
public int removeDuplicates(int[] nums) {
    int count = 0;
    for(int i = 1; i < nums.length; i++)
        if(nums[count] != nums[i])
            nums[++count] = nums[i];
    return nums.length == 0 ? 0 : count + 1;
}