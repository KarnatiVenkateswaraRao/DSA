package DSAPractice;
import java.util.Scanner;
public class ProblemSolving_8_NonDecreasingSubArray {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter array elements:");
        int []a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        // divide the array into non-decreasing sub arrays
        int []p= new int[n];
        for(int i=1;i<n;i++)
        {
            if(a[i-1]>a[i])
            {
                p[i]=1;
            }
            p[i]+=p[i-1];
        }
        System.out.println("prefix sum array :");
        for(int i=0;i<n;i++)
        {
            System.out.println(p[i]+" ");
        }
        System.out.println("Enter no of queries:");
        int q= sc.nextInt();
        for(int i=0;i<q;i++)
        {
            System.out.println("Enter query left right indices:");
            int l=sc.nextInt();
            int r= sc.nextInt();
            if(p[l] == p[r])
            {
                System.out.println("True");
            }
            else
                System.out.println("False");
        }

    }
}
