import java.util.HashSet;
import java.util.Scanner;
public class SetMatrixZeroes {

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dimensions of matrix n*m");

        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr[][] = new int [n][m];
        System.out.println("enter the array elements:");

        HashSet rowSet = new HashSet();
        HashSet colSet = new HashSet();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]= sc.nextInt();
                if(arr[i][j]==0)
                {
                    if(!rowSet.contains(i))
                    {
                        rowSet.add(i);
                    }
                    if(!colSet.contains(j))
                    {
                        colSet.add(j);
                    }
                }
            }

        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(rowSet.contains(i))
                {
                    arr[i][j]=0;
                }
                if(colSet.contains(j))
                {
                    arr[i][j]=0;
                }
            }
        }

        System.out.println("Set to zeros");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)

            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
