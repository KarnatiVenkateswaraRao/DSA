
public class RotateMatrixBy90 {
    public static void main(String [] args)
    {
        java.util.Scanner sc= new java.util.Scanner(System.in);

        System.out.println("Enter size of square matrix:");
        int n= sc.nextInt();

        System.out.println("Enter matrix elements:");
        int [][] arr = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        // Transpose of matrix
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp= arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // swap columns with respect to mid
        int mid= (int) Math.floor(n/2);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<mid;j++)
            {

                        int temp= arr[i][n-j-1];
                        arr[i][n-j-1]=arr[i][j];
                        arr[i][j]=temp;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}