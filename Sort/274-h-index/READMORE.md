# About h-index
In wiki:
```
Calculation :
Formally, if f is the function that corresponds to the number of citations for each publication, we compute the h index as follows. First we order the values of f from the largest to the lowest value. Then, we look for the last position in which f is greater than or equal to the position (we call h this position).
For example, if we have a researcher with 5 publications A, B, C, D, and E with 10, 8, 5, 4, and 3 citations, respectively, the h index is equal to 4 because the 4th publication has 4 citations and the 5th has only 3. In contrast, if the same publications have 25, 8, 5, 3, and 3, then the index is 3 because the fourth paper has only 3 citations.
f(A)=10, f(B)=8, f(C)=5, f(D)=4, f(E)=3　→ h-index=4
f(A)=25, f(B)=8, f(C)=5, f(D)=3, f(E)=3　→ h-index=3
```
As we know, H-Index is a measure of productivity and citation impact of a researcher. It is also called Hirsch index or Hirsch number after the name of the physicist Jorge Hirsch.
[h-index](https://github.com/linnever/LeetCodeSolution/blob/master/H-index-en.png)

so there is first solution in Solution.java .By sorting, it takes O(nlogn)  time complexity.

However,we can do much better by an O(n) time a algorithm.
- First you must know h-index isn't greater than number of papers.
- we can create another array which acts like a HashMap (using pigeon hole principle) and loop backwards from the highest element.(more details can see second solution in Solution.java  )
```
For example :
citations :     [3, 0, 6, 1, 5] (5 papers)

array index     0  1  2  3  4  5 (citations)
another array: [1, 1, 0, 1, 0, 2]  
                         |     |
                         1 +0 +2  =3
(array value 2 means the number of papers which's citation greater than the total papers )
```

//Chinese
另一个数组记录的是文章引用次数相同的文章数量，大于文章总数的单独记录。
然后从后往前遍历数组，把数组值相加如果大于等于当前的数组下标值，意味着有n篇文章的引用数大于n,即得到h-index的值。

用另一数组其实是为了计算引用次数从0 到 n 的文章数量，相当于排序。
