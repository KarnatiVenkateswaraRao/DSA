package DSAPractice;
import java.util.Scanner;
public class Bulbs {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n= sc.nextInt();
        System.out.println("Enter status of bulbs:");
        int []bulb= new int[n];
        for(int i=0;i<n;i++)
        {
            bulb[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n;i++)
        {
            if(count%2==0 && bulb[i]==0)
            {
                count++;
                bulb[i]=1;
            }
            else if(count%2==1 && bulb[i]==1)
            {
                count++;
            }
            else continue;
        }

        System.out.println("Count :"+count);
    }
}
