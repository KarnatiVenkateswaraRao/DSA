package DSAPractice;
import java.util.Scanner;
import java.util.Arrays;
public class MinesAndMiners {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of mines:");
        int n= sc.nextInt();

        System.out.println("Enter locations of mines:");
        int [] mine= new int[n];
        for(int i=0;i<n;i++)
        {
            mine[i]=sc.nextInt();
        }

        System.out.println("Enter locations of "+n+" miners");
        int [] miner= new int[n];
        for(int i=0;i<n;i++)
        {
            miner[i]=sc.nextInt();
        }

        Arrays.sort(mine);
        Arrays.sort(miner);

        float minSum=0;

        for(int i=0;i<n;i++)
        {
            minSum+= Math.sqrt(mine[i]*mine[i] + miner[i]*miner[i]);
        }
        System.out.println("Minimum energy:"+minSum);
    }
}
