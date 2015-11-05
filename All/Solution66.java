/*Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

Subscribe to see which companies asked this question*/

//its runtime  is  1ms.
public class Solution {
public int[] plusOne(int[] digits) {

    int length = digits.length;
    for(int i=length-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }

        digits[i] = 0;
    }
    int[] newdigits = new int [length+1];
    newdigits[0] = 1;
    return newdigits;
}
}
//but avoiding magic number. Its runtime is  0ms
public class Solution {
public int[] plusOne(int[] digits) {
    int plusNum=1;
    int length = digits.length;
    for(int i=length-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]+=plusNum;
            return digits;
        }

        digits[i] = 0;
    }
    int[] newdigits = new int [length+1];
    newdigits[0] = 1;
    return newdigits;
}
}