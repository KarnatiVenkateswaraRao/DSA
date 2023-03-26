package DSAPractice;
import java.util.Scanner;
public class Carotenemia {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of the Array of boxes : ");

        int n= sc.nextInt();

        System.out.println("Enter array elements:");

        int [] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println("enter no of oranges to be eaten :");

        int B= sc.nextInt();

        int orangesAte= 0;

        for(int i=0;i<n;i++)
        {
            orangesAte+=arr[i];

            if(orangesAte>=B)
            {
                System.out.println(i);
                break;
            }

            else
                continue;
        }

        if(orangesAte< B)
            System.out.println("-1");

    }
}
