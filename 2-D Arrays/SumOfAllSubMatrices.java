package DSAPractice;
import java.util.Scanner;
public class SumOfAllSubMatrices {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter dimensions of row based matrix:");
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

        System.out.println("All sub Strings:");

        // sum of no of times an element occurs * element

        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum+= a[i][j]* (i+1)*(n-i)*(j+1)*(m-j);
            }
        }

        System.out.println("Sum of all sub matrices:"+sum);

    }
}
