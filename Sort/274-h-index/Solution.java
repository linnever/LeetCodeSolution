//Time complexity:O(NlgN) Space O(1)
public class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;int result=0;
        if (citations == null || len == 0) return 0;
        Arrays.sort(citations);
        for(int i = len -1 ; i >= 0; i--){
            if(citations[i] > (len-i-1) )
            result++;
        }
        return result;
    }
//Time complexity: O(N) Space O(N)
public class Solution {
  public int hIndex(int[] citations) {
    int len = citations.length;
    if(citations ==null || len == 0) return 0;
    int[] status = new int[len + 1];
    for(int c : citations)
        status[c >= len ? len : c] +=1;
    int sum = 0;
    for(int i = len; i >= 0 ; i--){
        sum += status[i];
        if(sum >= i)
        return i;
    }
    return 0;
  }
}
