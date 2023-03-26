package DSAPractice;
import java.util.Scanner;
public class PrefixXOR {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n= sc.nextInt();
        int [] a= new int[n];
        System.out.println("Enter bit array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int [] prefixXorA= new int[n];
        prefixXorA[0]=a[0];
        System.out.print(prefixXorA[0]+" ");
        for(int i=1;i<n;i++)
        {

            prefixXorA[i]= a[i] ^ prefixXorA[i-1];
            System.out.print(prefixXorA[i]+" ");
        }

        System.out.println("Enter l and r:");

        int l= sc.nextInt();
        int r= sc.nextInt();

        System.out.println("The xor of l->r is :"+prefixXorA[r-1]);

    }
}
