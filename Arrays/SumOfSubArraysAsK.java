package DSAPractice;
import java.util.Scanner;
public class SumOfSubArraysAsK {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n= sc.nextInt();
        int []a= new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter target sum of sub array:");
        int k=sc.nextInt();

        int i=0,j=1,count=0;
        int sum=a[0]+a[1];
        while(i<=j)
        {

            if(sum==k)
            {
                count++;
                if(i==0)
                {
                    i++;
                }
                else if(j+1==0)
                {
                    j++;
                }
                else
                {
                    sum-=a[i];
                    i++;
                    j++;
                    if(j<n)
                        sum+=a[j];
                }
            }

            else if(sum <k && j+1<n)
            {
                j++;
                sum+=a[j];
            }
            else
            {
                sum-=a[i];
                i++;
            }
        }

        System.out.println("There are "+count+" such sub arrays.");
    }
}
