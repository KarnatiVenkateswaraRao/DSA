package DSAPractice;
import java.util.Scanner;
import java.util.HashMap;
public class ProblemSolving_7_DuplicateRows {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dimensions of the 2D row matrix:");
        int n=sc.nextInt();
        int m= sc.nextInt();
        String [] rows= new String[n];

        System.out.println("Enter rows:");
        for(int i=0;i<n;i++)
        {
            rows[i]=sc.next();
        }
        System.out.println("N:"+n);


        System.out.println("Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(rows[i]+" ");
        }

        HashMap h= new HashMap();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(rows[i]))
            {
                count++;
            }
            else
            {
                h.put(rows[i],1);
            }

        }

        System.out.println("No of duplicate rows:"+count);

    }
}
