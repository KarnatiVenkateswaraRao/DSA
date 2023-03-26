package DSAPractice;
import java.util.Scanner;
public class MaxLenOfSubArrayLessThanB {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n= sc.nextInt();
        int []a= new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter max sum:");
        int b=sc.nextInt();
        int sum=0,k=0,p1=0,p2=0;

        while(p2<n)
        {

            if(sum<b)
            {
                sum+=a[p2];
                System.out.println("sum:"+sum);
                p2++;
                k++;
            }
            else
            {
                sum-=a[p1];
                System.out.println("Sum2:"+sum);
                k--;
                p1++;
            }
        }
        if(sum<b)
            System.out.println("The max length of sub array :"+k);
        else
            System.out.println("The max length of sub array :"+(k-1));
    }
}
