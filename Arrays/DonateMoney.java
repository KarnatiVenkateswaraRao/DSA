package DSAPractice;
import java.util.Scanner;
public class DonateMoney {
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter No Of Beggars : ");
        int N= sc.nextInt();
        int [] b= new int[N];
        int M,L,R;
        System.out.println("Enter devotee details");
        for(int i=0;i<N;i++)
        {
            b[i]+=0;
        }
        while(sc.hasNextInt())
        {
            M= sc.nextInt();
            L=sc.nextInt();
            R=sc.nextInt();
            b[L]+=M;
            if(R+1<N)
                b[R+1]-=M;
        }
        for(int i=0;i<N;i++)
            System.out.print(b[i]+" ");
        System.out.println();
        for(int i=1;i<N;i++)
        {
            b[i]+=b[i-1];
        }

        for(int i=0;i<N;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
