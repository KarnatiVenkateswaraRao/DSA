package DSAPractice;
import java.util.Scanner;
public class EquilibriumIndex {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int n= sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int lSum=0,rSum=0,l=n-3,r=n-1;

        for(int i=0;i<=l;i++)
        {
            lSum+=a[i];
        }
        rSum=a[r];

        while(lSum!=rSum && l>-1)
        {
            lSum-=a[l];
            rSum+=a[r-1];
            l--;
            r--;
        }
        if(l<0)
            System.out.println("There is no equilibrium index");
        else
            System.out.println("Equilibrium Index :"+(l+1));
    }
}
