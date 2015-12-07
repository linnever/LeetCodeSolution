//O(1) space
public class Solution {
    public void sortColors(int[] nums) {
        int num0 = 0, num1 = 0, num2 = 0;
        for(int i : nums) {
        if (i == 0) num0++;
        else if (i == 1) num1++;
        else if (i == 2) num2++;
    }

    for(int i = 0; i < num0; i++) nums[i] = 0;
    for(int i = 0; i < num1; i++) nums[num0+i] = 1;
    for(int i = 0; i < num2; i++) nums[num0+num1+i] = 2;
    }
}
//counting sort :O(n) space
public class Solution {
    public void sortColors(int[] nums) {
        int[]status = new int[3];
        for (int n: nums){
            status[n]++;
        }
        int index = 0;
        for(int i = 0; i < 3; i++){
            while(status[i]-- > 0){
                nums[index++] = i;
            }
        }
    }
// one pass and constant space solution
public class Solution {
      public void sortColors(int[] A) {
          int i=-1, j=-1, k=-1;
          for(int p = 0; p < A.length; p++){
              if(A[p] == 0){
                  A[++k]=2;
                  A[++j]=1;
                  A[++i]=0;
              }
              else if (A[p] == 1){
                  A[++k]=2;
                  A[++j]=1;
              }
              else if (A[p] == 2){
                  A[++k]=2;
              }
          }
      }
}
