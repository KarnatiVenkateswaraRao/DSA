package DSAPractice;
import java.lang.System;
import java.util.Scanner;
public class Max1s_InBitArray {

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size ");
        int n= sc.nextInt();

        System.out.println("enter bit array");
        int [] arr= new int[n];


        for(int i=0;i<n;i++)
        {
            arr[i]=0;
            for(int j=0;j<n;j++)
            {
                arr[i]+=sc.nextInt();
            }
            System.out.println(i+" "+arr[i]);
        }
        int max=0,ind=0;

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<n ;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                ind=i;
            }
        }

        System.out.println("The max no of 1's are present in row number :"+ind);
    }



}
