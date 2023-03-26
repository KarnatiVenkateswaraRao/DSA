package DSAPractice;

import java.util.Scanner;
public class MaxAbsoluteDiffenrence {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of the array :");

        int n= sc.nextInt();

        int [] arr= new int[n];

        System.out.println("Enter array:");

        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        // Naive Approach
        /* int max=0,value;

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++) {
                value = Math.abs(arr[i] - arr[j]) + Math.abs(i - j);
                if (value > max) {
                    max = value;
                } else
                    continue;
            }
        }

        System.out.println("The maximum absolute difference is "+max);
    */

        // Approach 2

        int max1= Integer.MIN_VALUE;
        int min1= Integer.MAX_VALUE;
        int max2= Integer.MIN_VALUE;
        int min2= Integer.MAX_VALUE;

        // for i>j , max absolute difference of |a[i]-a[j]| + |i-j| , a[i] + i should be max and a[j]+ j should be min.
        // for i<j , max abs diff is a[i]-i - a[j]-j
        for(int i=0;i<n;i++)
        {
            max1= Math.max(max1, arr[i]+i);
            min1= Math.min(min1, arr[i]+i);
            max2= Math.max(max2, arr[i]-i);
            min2= Math.min(min2, arr[i]-i);
        }

        int maxAbsDiff= Math.max(max1-min1,max2-min2);

        System.out.println("The maximum absolute difference is:"+maxAbsDiff);

    }
}
