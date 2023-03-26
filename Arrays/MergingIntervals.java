package DSAPractice;
import java.util.Scanner;
public class MergingIntervals {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of intervals");
        int n= sc.nextInt();
        System.out.println("Enter interval left right:");
        int l[]= new int[n];
        int r[]= new int[n];
        for(int i=0;i<n;i++)
        {
            l[i]=sc.nextInt();
            r[i]=sc.nextInt();
        }
        System.out.println("Enter new interval:");
        int left=sc.nextInt();
        int right=sc.nextInt();
        int newL[]=new int[n];
        int newR[]=new int[n];
        int newLeft=0,newRight=0;

        for(int i=0;i<n;i++)
        {
            if(r[i]>=left)
            {
                newLeft=Math.min(l[i],left);
                System.out.println("left most: "+newLeft);
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(l[i]<=right)
            {
                newRight=Math.max(r[i],right);

                System.out.println("right most: "+newRight);
                break;
            }
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(r[i]<newLeft || l[i]>newRight )
            {
                newL[j]=l[i];
                newR[j]=r[i];
                System.out.println("added left :"+l[i]+" added Right:"+r[i]);
            }
            else {
                    while(r[i]>newLeft && r[i]<=newRight )
                    {
                        i++;
                    }
                    i--;
                    newL[j]=newLeft;
                    newR[j]=newRight;



                System.out.println("added the left :"+newLeft+" added the Right:"+newRight);
            }
            j++;
        }
        for(int i=0;i<j;i++)
        {
            System.out.print("left:"+newL[i]+" right:"+newR[i]+" ");
        }
    }
}
