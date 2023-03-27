package DSAPractice;
import java.util.Scanner;
public class ProblemSolving_6_XOR {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter bit array entries:");
        int []bit= new int[n];
        for(int i=0;i<n;i++)
        {
            bit[i]=sc.nextInt();
        }

        int []prefixXor= new int[n];
        prefixXor[0]=bit[0];
        for(int i=1;i<n;i++)
        {
            prefixXor[i]=bit[i]^prefixXor[i-1];
        }

        System.out.println("Enter l and r:");
        int l= sc.nextInt();
        int r= sc.nextInt();
        int output=0;
        if(l==0)
        {
            output= prefixXor[r];
        }
        else
            output=prefixXor[r]^prefixXor[l-1];
        System.out.println("Xor :"+ output);
    }
}
