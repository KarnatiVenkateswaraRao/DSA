package DSAPractice;
import java.util.Scanner;
import java.util.Arrays;
public class ProblemSolving_9_OptimalArrangementOfArray {
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
        System.out.println("Enter no of queries");
        int q= sc.nextInt();
        int [] frequency= new int[n];
        Arrays.fill(frequency,0);
        int l,r;
        for(int i=0;i<q;i++)
        {
            System.out.println("Enter left and right of next query(l<=r):");
            l=sc.nextInt();
            r=sc.nextInt();
            frequency[l]+=1;
            if(r+1<n)
            {
                frequency[r+1]+=-1;
            }
        }

        for(int i=1;i<n;i++)
        {
            frequency[i]+=frequency[i-1];
        }
        System.out.println("Frequency Array :");
        for(int i=0;i<n;i++)
        {
            System.out.print(frequency[i]+" ");
        }
        Arrays.sort(frequency);
        System.out.println();
        System.out.println(" Sorted Frequency Array :");
        for(int i=0;i<n;i++)
        {
            System.out.print(frequency[i]+" ");
        }
        Arrays.sort(a);
        System.out.println();
        System.out.println(" Sorted  Array :");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        int maxSum=0;
        int i=0;
        while(  i<n )
        {
            maxSum+= a[n-i-1]*frequency[n-i-1];
            i++;
        }

        System.out.println("Max Sum :"+maxSum);
    }

}
