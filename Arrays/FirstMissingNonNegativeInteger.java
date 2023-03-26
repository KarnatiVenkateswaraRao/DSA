package DSAPractice;
import java.util.Scanner;
public class FirstMissingNonNegativeInteger {
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
        int temp=0;
        for(int i=0;i<n;i++)
        {
            while(a[i]>=0 && a[i]<=n-1)
            {
                System.out.println("Enter while loop with i:"+i+ " a[i] :"+a[i]);
                if(a[i]!=a[a[i]])
                {
                    temp=a[a[i]];
                    a[a[i]]=a[i];
                    a[i]=temp;
                }
                else
                    break;
            }
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=i)
            {
                System.out.println("Missing term :"+i);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Missing term :"+n);
        }
    }
}
