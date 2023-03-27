package DSAPractice;
import java.util.Scanner;
public class SqrtOfANumber {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any positive integer:");
        int n= sc.nextInt();

        int low=0,high=n/2;
        int mid;

        while(low<=high)
        {
            mid=(low+high)/2;
            System.out.println("Before->"+"mid :"+mid+" low:"+low+" high:"+high);
            if((mid*mid)<=n && ((mid+1)*(mid+1))>n)
            {
                System.out.println("Square root of "+n+" is :"+mid);
                break;
            }
            else if((mid*mid) >n)
            {
                high= mid-1;
            }
            else
            {
                low=mid+1;
            }
            System.out.println("After->"+"mid :"+mid+" low:"+low+" high:"+high);
        }
    }
}
