/*Search in Rotated Sorted Array II 

Follow up for "Search in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?

Write a function to determine if a given target is in the array.*/

//O(N)
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

//@1337c0d3r 's solutions
/*Yes, when there could be duplicates in the array, the worst case is O(n).

To explain why, consider this sorted array 1111115, which is rotated to 1151111.

Assume left = 0 and mid = 3, and the target we want to search for is 5. Therefore, the condition A[left] == A[mid] holds true, which leaves us with only two possibilities:

All numbers between A[left] and A[right] are all 1's.
Different numbers (including our target) may exist between A[left] and A[right].
As we cannot determine which of the above is true, the best we can do is to move left one step to the right and repeat the process again. Therefore, we are able to construct a worst case input which runs in O(n), for example: the input 11111111...115.

Below is a pretty concise code (thanks to bridger) for your reference which I found from the old discuss.*/
bool search(int A[], int n, int key) {
    int l = 0, r = n - 1;
    while (l <= r) {
        int m = l + (r - l)/2;
        if (A[m] == key) return true; //return m in Search in Rotated Array I
        if (A[l] < A[m]) { //left half is sorted
            if (A[l] <= key && key < A[m])
                r = m - 1;
            else
                l = m + 1;
        } else if (A[l] > A[m]) { //right half is sorted
            if (A[m] < key && key <= A[r])
                l = m + 1;
            else
                r = m - 1;
        } else l++;
    }
    return false;
}