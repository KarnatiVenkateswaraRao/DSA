package DSAPractice;
import java.util.Scanner;
public class NumberOfSetBitsInN {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a non negative number:");
        int n= sc.nextInt();
        int count=0;
        while(n>0)
        {
            n= n& (n-1);
            count++;
        }

        System.out.println("No of set bits :"+count);
    }
}
