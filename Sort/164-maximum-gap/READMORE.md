# Analysis
Suppose there are N element in the array ,the min value is **min** and the max value is **maz**.then It is obviously that the maximum gap will be not smaller than  ``` ceiling[(**max** - **min**) / (N -1 )] ``` .(this is really obviously.^.^)
Than we can use Bucket sort (if you are not familiar with it you can see [this](https://en.wikipedia.org/wiki/Bucket_sort))


```Let gap = ceiling[(max - min ) / (N - 1)].```
 We divide all numbers in the array into n-1 buckets.

```
int idx = (i - min) / gap; // index of the right position in the buckets
bucketsMIN[idx] = Math.min(i, bucketsMIN[idx]);
bucketsMAX[idx] = Math.max(i, bucketsMAX[idx]);
```
We only need to store the largest number and the smallest number in each bucket.The largest gap must be between successive bucket.(this is also obviously!)
