package DSAPractice;
import java.util.Scanner;
public class LocalMinima {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter array elements:");
        int []a= new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        if(a[0]<a[1])
        {
            System.out.println("Local minima is:"+a[0]);
        }
        else if(a[n-1]<a[n-2])
        {
            System.out.println("Local minima is:"+a[n-1]);
        }
        else {
            int low=1;
            int high=n-2;
            int mid;

            while(low<=high)
            {
                mid=(low+high)/2;

                if(a[mid]<a[mid-1])
                {
                    if(a[mid]<a[mid+1])
                    {
                        System.out.println("The local minima is :"+a[mid]);
                        break;
                    }
                    else
                    {
                        low=mid+1;
                    }
                }
                else
                {
                    high=mid-1;
                }

            }
        }
    }
}
