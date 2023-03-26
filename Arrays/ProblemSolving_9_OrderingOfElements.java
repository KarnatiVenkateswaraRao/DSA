package DSAPractice;
import java.util.Scanner;
import java.util.Arrays;
public class ProblemSolving_9_OrderingOfElements {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter array elements:");
        int [] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            if(Math.abs(a[n-i-1]-a[0]) > Math.abs(a[n-i-1]-a[n-i-2]))
            {
                 temp= a[0];
                 a[0]= a[n-i-2];
                 a[n-i-2]=temp;
            }
        }

        System.out.println("Output :");

        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
