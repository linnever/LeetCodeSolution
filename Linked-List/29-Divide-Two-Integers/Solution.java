public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long divd = Math.abs((long)dividend);
        long divs = Math.abs((long)divisor);

        int ret = 0;
        while (divd >= divs) {
            int counter = 0;
            while (divd >= (divs << counter)) { // keep multiply by 2 until divs > divd
                counter++;
            }
            counter--;  // rollback counter so that (divs<<counter) <= divd
            ret += 1 << counter;  // quotient
            divd -= divs << counter;
        }

        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
            return ret;
        else
            return -ret;
    }
}
//for example
/*
16/3 :         3*2^2=12   < 16 < 3*2^3=24
              counter = 3 then counter-- =2
              ret = ret + 1*2^2=4
              divd = divd - divs*2^2 = 4 > divs = 3
              continue first while loop (4 / 3)
              counter = 1 then counter-- =0
              then ret = ret + 1*2^0 =4 + 1 = 5
              divd =divd - divs*2^0 =4 - 3 = 1 <divs =3
              so ans = 5
*/
