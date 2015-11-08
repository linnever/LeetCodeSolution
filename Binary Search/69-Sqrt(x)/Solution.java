//Time complexity:O(lgN) Space O(1)
public class Solution {
    public int mySqrt(int x) {
      if (0 == x) return 0;
        int left = 1, right = x, ans=0;
        while (left <= right) {
            int mid = left + ((right - left)>>1);
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
//Newton’s method
public class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        double x0=1,num=0;
        while(num!=x0){
            num=x0;
            x0=(num+x/num)/2;
        }
        return (int)num;
    }
}