/*
 *Summary Ranges
 *
 *Given a sorted integer array without duplicates, return the summary of its ranges.
 *For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 *
 */
public class Solution 
{
    public List<String> summaryRanges(int[] nums) 
    {
    	List<String> list = new ArrayList<String>();
    	if(nums.length==1)
    		list.add(nums[0]+"");
    	else
    	{
    		for(int i = 0;i < nums.length; i++)
    		{
    			int index=i;//note first number's index
    			while( i+1 < nums.length && nums[i+1]-nums[i]==1 )
    			{
    				i++;
    			}
    			if(i-index>=1)//more than 2 numbers
    				list.add(nums[index] + "->" + nums[i]);
    			else
    				list.add(nums[index] + "");
    		}
        
        }
        return list;
    }
}