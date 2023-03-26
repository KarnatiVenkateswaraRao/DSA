package DSAPractice;
import java.util.Scanner;
public class CountTotalSetBitsInNNaturalNumbers {
    public int sum(int n)
    {
        if(n<=2)
        {
            if(n<=1)
                return 0;
            else
                return 2;

        }
        else {
            int nps=1;
            int count=0;
            while(nps<n)
            {
                nps=nps*2;
                count++;
            }
            if(nps>n)
            {
                nps=nps/2;
                count--;
            }

            //System.out.println("nps :"+nps+" count:"+count+" n:"+n );
            //System.out.println("Sum:"+ ((count*((nps/2 ))) + n-(nps-1)));
            return (count*((nps/2 ))) + n-(nps-1) + sum(n-(nps-1)-1);
        }

    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N numbers:");
        int n= sc.nextInt();
        int sum=1;
        CountTotalSetBitsInNNaturalNumbers cts= new CountTotalSetBitsInNNaturalNumbers();
        // calculate perfect square before N.


        int sumOfSetBits= cts.sum(n);

        System.out.println("The sum of set bits in first n Number is:"+sumOfSetBits);



    }
}
