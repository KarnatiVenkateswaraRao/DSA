package DSAPractice;

import java.util.Scanner;
public class HotelBookings {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of peoople:");
        int n= sc.nextInt();
        int [] checkInDates= new int[n];
        int [] checkOutDates = new int[n];
        System.out.println("Enter check in and check out dates:");
        for(int i=0;i<n;i++)
        {
            checkInDates[i]=sc.nextInt();
            checkOutDates[i]=sc.nextInt();
        }
        System.out.println("Enter Capacity :");
        int k= sc.nextInt();
        int count=0;

        for(int i=0,j=0;i<n;)
        {
            if(checkInDates[i]<checkOutDates[j])
            {
                count++;
                if(count>k)
                {
                    System.out.println("Limit exceeded ");
                    System.exit(1);
                }
                i++;
            }
            else if(checkInDates[i]>checkInDates[j])
            {
                count--;
                j++;
            }
            else {
                continue;
                //because if a person arrives and another on leaves count doesn't get effected.
            }
        }
        System.out.println("No problems.");
    }
}
