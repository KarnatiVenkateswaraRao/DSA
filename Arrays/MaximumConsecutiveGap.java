package DSAPractice;

import java.util.Scanner;
public class MaximumConsecutiveGap {

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter size of the array:");
        int n= sc.nextInt();

        if(n<2)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("Enter array elements:");

            int [] arr= new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int maxConGap= Integer.MIN_VALUE;
            for(int i=0;i<n-1;i++)
            {
                maxConGap=Math.max(maxConGap, arr[i]-arr[i+1]);
            }

            System.out.println("Maximum Consecutive Gap is "+ maxConGap);
        }
    }
}
