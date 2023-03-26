package DSAPractice;
import java.util.Scanner;
public class SumOFORedSubArrays {
    public int countSetBits(int[] a)
    {
        int n= a.length,sum=0,count=0;
        for(int i=0;i<n;i++)
            System.out.print("a:"+a[i]+" ");
        System.out.println();
        sum=n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            if(a[i] == 0)
            {
                count++;
            }
            else
            {
                System.out.println("Sum1 :"+sum);
                sum-= count*(count+1)/2;
                System.out.println("Sum2 :"+sum);
                count=0;
            }
        }
        sum-=count*(count+1)/2;
        System.out.println("Sum :"+sum);
        return sum;
    }

    public static void main(String [] args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size= sc.nextInt();
        System.out.println("Enter array elements:");
        int [] a= new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int [][]b= new int[size][32];
        int val=0;
        for(int i=0;i<size;i++)
        {
            val=a[i];
            for(int j=0;j<32;j++)
            {
                if(val!=0)
                {
                    b[i][32-j-1]=a[i]%2;
                    a[i]=a[i]/2;
                }
            }
        }

       /* System.out.println("Binary Array");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<32;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        */
        int sum=0;
        int [][]bitArray= new int[32][size];
        for(int j=0;j<32;j++)
        {
            for(int i=0;i<size;i++)
            {
                bitArray[j][i]=b[i][j];
            }
        }
        /*
        System.out.println("Bit Array");
        for(int i=0;i<32;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(bitArray[i][j]+" ");
            }
            System.out.println();
        }
        */

        int [] row= new int[size];
        SumOFORedSubArrays s= new SumOFORedSubArrays();
        for(int i=0;i<32;i++)
        {
            sum+= s.countSetBits(bitArray[i])*Math.pow(2,32-i-1);
        }

        System.out.println("Sum:"+sum);



    }
}
