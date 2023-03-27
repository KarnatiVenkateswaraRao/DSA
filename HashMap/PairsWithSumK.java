package DSAPractice;
import java.util.Scanner;
public class PairsWithSumK {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter array elements");
        int []a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter preferred sum:");
        int sum=sc.nextInt();
        int i=0,j=n-1,count=0;

        while(i<j)
        {
            if((a[i]+a[j]) == sum)
            {
                count+=1;
                i++;
                j--;
            }
            else if((a[i]+a[j]) < sum)
            {
                i++;
            }
            else
            {
                j--;
            }

        }

        System.out.println("There are "+count+" pairs with sum "+sum);
    }
}
