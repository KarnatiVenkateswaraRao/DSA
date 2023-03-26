package DSAPractice;
import java.util.Scanner;
public class MaximumSumSubArray {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter array elements:");
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;

        int [] prefix= new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=arr[i-1];
        }


        int max=0;
        /*
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                max= Math.max(max,sum);

               System.out.println("Sum :"+sum);

            }
            System.out.println();


        }*/

        // kaden's algorithm

        // since we need to find max sum sub array lets not consider sub array whose sum is less than or equal to zero.
        int start=0;
        int end=0;
        max=arr[0];
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
        }

        if(max<=0)
        {
            System.out.println("max:"+max);
            System.exit(1);
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum<=0)
            {
                sum=0;
                start=i;
            }
            else
            {
                if(max<sum)
                {
                    end=i;
                }
                max= Math.max(max,sum);
            }
        }
        System.out.println("Max:"+max);
        System.out.println("start :"+(start+1));
        System.out.println("end:"+end);
    }
}
