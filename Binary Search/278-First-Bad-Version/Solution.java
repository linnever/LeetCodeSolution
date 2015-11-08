//'left + right' may cause the Integer Overflow, meaning that left+right > 2147483647
//Time complexity:O(lgN) Space:O(1)
public class Solution extends VersionControl {
public int firstBadVersion(int n) {
    int start = 1, end = n;
    while (start < end) {
        int mid = start + (end-start) / 2;
        if (!isBadVersion(mid)) start = mid +1;
        else end = mid;            
    }        
    return start;
}
}