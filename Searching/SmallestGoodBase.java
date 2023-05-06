package DSAPractice;

import java.util.ArrayList;
import java.util.List;

//Smallest Good Base
//Given an integer A, we call k >= 2 a good base of A, if all digits of A base k are 1. Now given a string representing A, you should return the smallest good base of A in string format.
//Input Format
//The only argument given is the string representing A.
//Output Format
//Return the smallest good base of A in string format.
//Constraints
//3 <= A <= 10^18
//For Example
//Input 1:
//    A = "13"
//Output 1:
//    "3"     (13 in base 3 is 111)
//
//Input 2:
//    A = "4681"
//Output 2:
//    "8"     (4681 in base 8 is 11111)
//
public class SmallestGoodBase {
    public static String getMinGoodBase(String n)
    {
        long x = Long.parseLong(n);
        List<Long> listt = new ArrayList<>();
        listt.add(x-1);
        long y = x-1;
        for (int i = 2; i < 63; i++)
        {
            double val = Math.pow(y, 1.0 / i);
            long value = (long) val;
            for (int j = 0; j > -3 && value + j > 1; j--)
            {
                long d = value + j;
                if (y % d == 0)
                {
                    long poly = getPolynomial(d, i);
                    if (poly == x)
                    {
                        listt.add(d);
                    }
                }
            }
        }
        long end = listt.get(listt.size() - 1);
        return end+"";
    }
    public static long getPolynomial(long d, int n)
    {
        long out = 1;
        long k = 1;
        for (int i = 0; i < n; i++)
        {
            k *= d;
            out += k;
        }
        return out;
    }
    public static void main(String args[])
    {
        String num="15";
        System.out.println(getMinGoodBase(num));
    }
}
