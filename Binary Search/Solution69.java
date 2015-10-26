/*Sqrt(x) Total Accepted: 
Implement int sqrt(int x).
Compute and return the square root of x.
*/

//Newton's method
public class Solution {
    public int mySqrt(int x) {
        if(x==0)
        	return 0;
        double x0=1,num=0;
        while(num!=x0){
            num=x0;
            x0=(num+x/num)/2;
        }
        return (int)num;
    }
}

//binary method
public class Solution {
    public int mySqrt(int x) {
      if (0 == x) return 0;
        int left = 1, right = x, ans=0;
        while (left <= right) {
          /* why not mid=(right-left)/2 ????
        	you should consider if (right-left)/2==0 
        	than x/0 is not permission
          */
            int mid = left + (right - left) / 2;//
            if (mid <= x / mid) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}