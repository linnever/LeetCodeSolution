# Possible solution
This problems seems trivial.So let's try different approaches to solve it:
Starting from worst time complexity to the best one:

## Time complexity:O(N^2),space:O(1)

the naive approach woule be to run a iteration for each element and see whether a duplicate value can be found:this resluts in O(N^2) time complexity.
```
public boolean containsDuplicate(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
```
## Time complexity:O(NlgN),space:O(1)-not counting the memory used by sort

Since it is a trivial task to find duplicate in sorted array,we can sort it as the first step of the algorithm and the search for consecutive duplicates.

```
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int ind = 1; ind < nums.length; ind++) {
            if(nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }
```

## Time complexity:O(N) ,space:O(N)

finally we can used a well known data structure hash table that will help us to identify whether an element has been previously encountered in the array.
```
public boolean containsDuplicate(int[] nums) {

    final Set<Integer> distinct = new HashSet<Integer>();
    for(int num : nums) {
        if(distinct.contains(num)) {
            return true;
        }
        distinct.add(num);
    }
    return false;
}
```

This is trivial but quite nice example of space-time tradeoff.