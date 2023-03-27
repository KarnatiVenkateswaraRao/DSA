package DSAPractice;
import java.util.Scanner;
public class PositionCowsInStalls {

    boolean check(int []stall,int n,int m,int d)
    {
        m=m-1;
        int prev=0;
        for(int i=1;i<n;i++)
        {
            if(m==0)
                break;
            if(stall[prev]+d<=stall[i])
            {
                prev=i;
                m--;
            }
        }
        return m==0;
    }

    public static void main(String [] args)
    {
        PositionCowsInStalls p= new PositionCowsInStalls();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of stalls:");
        int n= sc.nextInt();
        System.out.println("Enter positions of stalls:");
        int []stall= new int[n];
        for(int i=0;i<n;i++)
        {
            stall[i]=sc.nextInt();
        }
        System.out.println("Enter no of cows:");
        int m=sc.nextInt();

        int l=1,r=n-1,mid;
        int ans=1;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(p.check(stall,n,m,mid))
            {
                ans= Math.max(ans,mid);
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }

        System.out.println("Maximum minimum gap:"+ans);
    }
}
