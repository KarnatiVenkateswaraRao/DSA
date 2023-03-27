package DSAPractice;
import java.util.Scanner;
import java.util.Arrays;
public class ProblemSolving_8_GravityFlip {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of columns of boxes");
        int n= sc.nextInt();
        System.out.println("Enter nno of boxes in each column:");
        int [] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("boxes after gravity shift to right:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
