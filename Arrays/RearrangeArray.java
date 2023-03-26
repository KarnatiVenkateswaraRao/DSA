package DSAPractice;
import java.util.Scanner;
public class RearrangeArray {
    public static void main(String [] args)
    {
        // The idea of rearranging array is to replace a[i]=j to a[j]=i.
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of the array ;");
        int n= sc.nextInt();
        System.out.println("Enter array elements :");
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        /* Using extra space
        int [] b= new int[n];
        for(int i=0;i<n;i++)
        {
            b[arr[i]]=i;
        }

        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");
        */

        // Without using extra space

        for(int i=0;i<n;i++)
        {
            arr[arr[i]%n]+=i*n;
        }

        for(int i=0;i<n;i++)
        {
            arr[i]/=n;
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+" ");
    }
}
