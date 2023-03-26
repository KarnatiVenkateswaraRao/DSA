package DSAPractice;
import java.util.Scanner;
public class Bitmanipulation_2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n= sc.nextInt();
        int [] array= new int[n];
        System.out.println("Enter array elements");

        for(int i=0;i<n;i++)
        {
            array[i]= sc.nextInt();
        }
        int ans=0;
        int count=0;
        for(int i=0;i<32;i++)
        {
            count=0;
            for(int j=0;j<n;j++)
            {
                if((array[j]>>i & 1)==1) {
                    count += 1;
                }
            }
            if(count%3==1)
                ans= ans|(1<<i);
        }
        System.out.println(ans);
    }
}
