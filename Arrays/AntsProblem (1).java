package DSAPractice;
import java.util.Scanner;
public class ProblemSolving_8_AntsProblem {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n= sc.nextInt();
        System.out.println("Enter ant positions and direction 0 for left 1 for right:");
        int [][]a= new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        System.out.println("Enter speed of each ant:");
        int speed=sc.nextInt();

        int mTLPosition=a[0][0];
        int mTRPosition=a[0][0];
        for(int i=0;i<n;i++)
        {
            if(a[i][0]==1 && a[i][1]==1)
            {
                mTLPosition=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i][0]==1 && a[i][1]==0)
            {
                mTRPosition=i;
            }
        }

        System.out.println("Max time :"+(Math.max(n-mTLPosition-1, mTRPosition))/speed);

    }
}
