package DSAPractice;
import java.util.Scanner;
public class PickTwoWallsWithMaxWater {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of walls:");
        int n= sc.nextInt();
        System.out.println("Enter heights of walls:");
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int i=0,j=n-1,max=Integer.MIN_VALUE;

        while(i<j)
        {
            if(a[i]<=a[j])
            {
                max=Math.max(max, a[i]*(j-i));
                i++;
            }
            else
            {
                max=Math.max(max,a[j]*(j-i));
                j--;
            }
        }

        System.out.println("Max amount of water stored is :"+max);
    }
}
