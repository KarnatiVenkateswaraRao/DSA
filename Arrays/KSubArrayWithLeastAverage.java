package DSAPractice;
import java.util.Scanner;
public class KSubArrayWithLeastAverage {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter size of the subArray:");
        int k= sc.nextInt();
        if(k>n)
        {
            System.out.println("k should be less than n");
            System.exit(1);
        }
        int [] a = new int[n];
        System.out.println("Enter array elements:");
        a[0]=sc.nextInt();
        for( int i=1; i<n;i++)
        {
            a[i]=a[i-1]+ sc.nextInt();
        }

        int left=1,right=k;

        int leastSum=a[2];
        while(right <n)
        {
            leastSum = Math.min( leastSum , a[right]-a[left-1]);
            right++;
            left++;
        }
        System.out.println("Right :"+right+ "  Left :"+left);
        System.out.println("Least avg is :"+ (double)(leastSum/k));
    }
}
