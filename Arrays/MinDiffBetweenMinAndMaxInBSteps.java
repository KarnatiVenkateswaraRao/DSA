package DSAPractice;

import java.util.HashMap;
import java.util.Scanner;

public class MinDiffBetweenMinAndMaxInBSteps {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n= sc.nextInt();
        int [] a= new int[n];
       System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter no of steps:");
        int b= sc.nextInt();

        HashMap<Integer,Integer> freq= new HashMap();

        for(int i=0;i<n;i++)
        {
            if(freq.containsKey(a[i]))
            {
                freq.put(a[i],freq.get(a[i])+1);
            }
            else {
                freq.put(a[i],1);
            }
        }
        int minDiff=Integer.MAX_VALUE;
        int min=a[0],max=a[0];

        for(int i=1;i<n;i++)
        {
            if(min>a[i]) min=a[i];
            if(max<a[i]) max=a[i];
        }
        int f1,f2;
        while(true)
        {
            f1=freq.get(max);
            f2=freq.get(min);
            if(f1<f2)
            {
                if(f1<=b)
                {
                    if(freq.containsKey(max-1))
                        freq.put(max-1,f1+freq.get(max-1));
                    else
                        freq.put(max-1,f1);
                    freq.remove(max);
                    b-=f1;
                    max=max-1;
                    System.out.println("Status :"+ freq +" min:"+min+" max:"+max);
                }
                else
                    break;
            }
            else {
                if (f2<=b)
                {
                    if(freq.containsKey(min+1))
                        freq.put(min+1,f2+freq.get(min+1));
                    else
                        freq.put(min+1,f2);
                    freq.remove(min);
                    b-=f2;
                    min+=1;
                    System.out.println("Status :"+ freq +" min:"+min+" max:"+max);

                }
                else
                {
                    break;
                }
            }

            if(minDiff>max-min)
            {
                minDiff=max-min;
            }
        }

        System.out.println("Min diff  after given steps is :"+minDiff);
    }
}
