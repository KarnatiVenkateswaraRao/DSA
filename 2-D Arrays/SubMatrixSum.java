package DSAPractice;
import java.util.Scanner;
public class SubMatrixSum {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the row matrix");
        int n= sc.nextInt();
        int m= sc.nextInt();
        System.out.println("Enter matrix elements");
        int [][] a= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        if(a[n-1][m-1] <=0)
        {
            System.out.println("Maximum value in a sub matrix is : "+a[n-1][m-1]);
            System.exit(1);
        }

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

        System.out.println("The 2D prefix sum matrix is:");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("give range of sub matrix in order top left right bottom");
        int t= sc.nextInt();
        int l= sc.nextInt();
        int r= sc.nextInt();
        int b= sc.nextInt();
        int sum=0;
        if(t<m && l<n && b>=t && b<m && r>=l && r<n)
        {
            if(t==0 && l==0)
            {
                sum= a[b][r];
            }
            else if(t==0)
            {
                sum = a[b][r] -a[b][l-1];
            }
            else if(l==0)
            {
                sum= a[b][r] - a[t-1][r];
            }
            else
            {
                sum= a[b][r] - a[t-1][r]- a[b][l-1]- a[t-1][l-1];
            }

        }
        System.out.println("The sum of the sub matrix is :"+sum);

    }
}
