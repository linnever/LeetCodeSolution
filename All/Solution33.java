/*Search in Rotated Sorted Array 

Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.*/


//simple way 
//it's O(N)
public class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        if(len==0)
        return -1;
        for(int i=0;i<len;i++){
            if(nums[i]==target)
            return i;
        }
        return -1;
    }
}

//binary search
public int search(int[] A, int target) {
    // check if the target is in the sorted part, if so keep doing the binary search
    // otherwise throw away the sorted part and do the same on the other part of the array
    int start = 0;
    int end = A.length-1;

    while (start <= end) {
        int mid = (start + end) / 2;
        if (A[mid] == target) return mid;
        if (A[start] <= A[mid]) {
            // situation 1, red line
            if (A[start] <= target && target <= A[mid]) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        else {
            // situation 2, green line
            if (A[mid] <= target && target <= A[end]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
    }
    return -1;      
}