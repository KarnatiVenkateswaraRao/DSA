package DSAPractice;

import java.util.HashMap;
import java.util.Scanner;
public class CheckIfGivenArrayInAP {

    public static void main(String [] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter array elements:");
        int [] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            min = Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }

        for(int i=0;i<n;i++)
        {
            a[i]=a[i]-min;
        }
        int d=  (max-min)/(n-1);;
        int flag=0;
        if((max-min)%(n-1) !=0)
        {
            System.out.println("Not in Ap");
            flag=1;
        }

        else if(max==min )
        {
            flag=0;

        }
        else
        {

            HashMap<Integer,Integer> map = new HashMap();

            for(int i=0;i<n;i++)
            {
                if(map.containsKey(a[i]/d))
                {
                    System.out.println("NOT in AP");
                    flag=1;
                    break;
                }
                else
                {
                    if((a[i]%d)!=0)
                    {
                        System.out.println("Not in AP");
                        flag=1;
                        break;
                    }

                    map.put(a[i]/d,1);
                }
            }

            for(int i=0;i<n;i++)
            {
                if(!map.containsKey(i))
                {
                    System.out.println("Not in Ap");
                    flag=1;
                    break;
                }
            }
        }

        if(flag!=1)
        {
            System.out.println("Array is in AP");
        }


    }
}
