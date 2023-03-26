package DSAPractice;
import java.util.Scanner;

public class BitManipulation_1 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is written to find a number in a group of integers whose frequency is 2 ");

        System.out.println("Enter the size of the array");

        int n= sc.nextInt();
        if(n%2==0)
        {
            System.out.println("The Size of the array cannot be even");

        }
        else {
            int [] integerArray= new int[n];
            System.out.println("Enter array elements");
            for(int i=0;i<n;i++)
            {
                integerArray[i]=sc.nextInt();
            }

            System.out.println("The given array is :"+integerArray);
            int unique=0;
            for(int i=0;i<n;i++)
            {
                unique=unique^integerArray[i];
            }

            System.out.println("The unique number is:"+unique);
        }


    }
}
