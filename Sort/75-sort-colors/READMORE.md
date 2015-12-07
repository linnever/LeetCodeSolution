# Haha
if you insist on using library's sort,you can do it follow up and it can pass.

```
Arrays.sort(nums);
```

## counting sort

```
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
```

if you want to see more way to solve this problems.you can see [this](https://leetcode.com/discuss/20951/four-different-solutions)
