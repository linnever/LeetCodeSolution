/*
 *Find Minimum in Rotated Sorted Array Total Accepted
 *Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *Find the minimum element.
 *You may assume no duplicate exists in the array.
 */
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