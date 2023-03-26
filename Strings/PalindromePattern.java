package DSAPractice;
import java.util.Scanner;
public class PalindromePattern {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a positive integer :");
        int n= sc.nextInt();
        int [][] matrix= new int[n][n];
        for(int i=0;i<=n/2;i++)
        {
            int val=i+1;
            for(int j=n/2;j>=0;j--)
            {
                if(val>0)
                {
                    matrix[i][j]=val;
                    val-=1;
                }
                else
                {
                    matrix[i][j]=0;
                }
            }
            System.out.println();
        }

        for(int i=0;i<=n/2;i++)
        {

            for(int j=n/2+1;j<n;j++)
            {
                matrix[i][j]=matrix[i][n-j-1];
            }
        }

        for(int i=n/2+1;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=matrix[n-i-1][j];
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                    System.out.print(" ");
                else
                    System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
