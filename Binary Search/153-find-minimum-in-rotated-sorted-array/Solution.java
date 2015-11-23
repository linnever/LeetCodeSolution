public class Solution
{
	public int findMin(int []nums)
	{
		int len=nums.length;
		if(len==1)
			return nums[0];
		int left=0,right=len-1;
		while(nums[left]>nums[right])
		{
			int mid=(left+right)/2;
			if(nums[mid]>nums[right])
				left=mid+1;
			else
				right=mid;
		}
		return nums[left];
	}
}
