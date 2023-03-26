package DSAPractice;
import java.util.Scanner;
public class MaximumSumSubMatrix {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of row matrix");
        int n= sc.nextInt();
        int m= sc.nextInt();

        int [][] a= new int[n][m];
        System.out.println("Enter matrix elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }

        if(a[n-1][m-1]<=0)
        {
            System.out.println("The sub matrix with maximum sum has :"+a[n-1][m-1]);
        }

        else {
            for(int i=0;i<n;i++)
            {
                for(int j=1;j<m;j++)
                {
                    a[i][j]+=a[i][j-1];
                }
            }

            for(int j=0;j<m;j++)
            {
                for(int i=1;i<n;i++)
                {
                    a[i][j]+=a[i-1][j];
                }
            }

            // Finding top left corner
            long sum=0;
            long max= a[n-1][m-1];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(i==0 && j==0)
                    {
                        sum= a[n-1][m-1];
                    }
                    else if(i==0)
                    {
                        sum= a[n-1][m-1] - a[n-1][j-1];
                    }
                    else if(j==0)
                    {
                        sum = a[n-1][m-1] - a[i-1][n-1];
                    }
                    else {
                        sum= a[n-1][m-1] - a[i-1][n-1] - a[n-1][j-1] + a[i-1][j-1];
                    }
                    System.out.println("Sum :"+sum);
                    if(max < sum)
                    {
                        max= sum;
                        System.out.println("max sum changed to :"+max);
                    }
                }
            }

            System.out.println("Max sum :"+max);
        }

    }
}
