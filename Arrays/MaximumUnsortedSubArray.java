package DSAPractice;
import java.util.Scanner;
public class MaximumUnsortedSubArray {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n= sc.nextInt();
        System.out.println("Enter array elements");
        int [] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int [] b= new int[n];
        for(int i=0;i<n;i++)
            b[i]=a[i];



        java.util.Arrays.sort(b);


        int unorthodox=0,l=-1,r=-1;

        for(int i=0;i<n;i++)
        {
            if(a[i] !=b[i])
            {
                unorthodox=a[i];
                l=i;
                break;
            }
        }

        for(int i=l+1;i<n;i++)
        {
            if(unorthodox>a[i])
            {
                r=i;
            }
            else if(unorthodox<a[i])
            {
                unorthodox=a[i];
            }
            else
                continue;
        }

        System.out.println("l :"+l+" "+a[l]+" to r: "+r+" "+a[r]);
    }
}
