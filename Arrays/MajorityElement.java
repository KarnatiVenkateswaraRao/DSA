package DSAPractice;
import java.util.Scanner;
public class MajorityElement {
    // Check if there exists an element whose frequency is greater than half the length of the array;

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n= sc.nextInt();
        System.out.println("Enter array elements");
        int []a=  new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int majority=a[0];
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(majority==a[i])
            {
                count++;
            }
            else {
                count--;
            }
            if(count<=0)
            {
                majority=a[i];
            }
        }
        System.out.println("the majority element is :"+majority);
        count=0;
        for(int i=0;i<n;i++)
        {
            if(majority==a[i])
            {
                count++;
            }
        }
        System.out.println("The count of majority element :"+count);
        if(count>n/2)
        {
            System.out.println("There exist a majority element "+majority+" in the given array.");
        }
        else {
            System.out.println("There is no such element");
        }
    }
}
