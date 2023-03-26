package DSAPractice;
import java.util.Scanner;
public class Maxabc_MinabcIsMin {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sizes of three arrays:");
        int s1= sc.nextInt();
        int s2= sc.nextInt();
        int s3= sc.nextInt();

        System.out.println("Enter array 1 elements:");
        int [] a1= new int[s1];
        for(int i=0;i<s1;i++)
        {
            a1[i]= sc.nextInt();
        }

        System.out.println("Enter array 2 elements:");
        int [] a2= new int[s2];
        for(int i=0;i<s2;i++)
        {
            a2[i]= sc.nextInt();
        }

        System.out.println("Enter array 3 elements:");
        int [] a3= new int[s3];
        for(int i=0;i<s3;i++)
        {
            a3[i]= sc.nextInt();
        }

        int p1=0,p2=0,p3=0;
        int min=Integer.MAX_VALUE;
        int tempMin=Integer.MAX_VALUE;
        while(true)
        {
            if(p1<s1 && p2<s2 && p3<s3)
            {
                tempMin=Math.max(Math.max(a1[p1],a2[p2]),a3[p3])- Math.min(Math.min(a1[p1],a2[p2]),a3[p3]);
                if(tempMin<min)
                {
                    min=tempMin;
                }
                if(a1[p1]<a2[p2])
                {
                    if(a1[p1]<a3[p3])
                    {
                        if(p1<s1)
                            p1++;
                        else break;
                    }
                    else {
                        if(p3<s3)
                            p3++;
                        else break;
                    }
                }
                else
                {
                    if(a2[p2]<a3[p3])
                    {
                        if(p2 < s2)
                            p2++;
                        else break;
                    }
                    else
                    {
                        if(p3 < s3)
                            p3++;
                        else break;
                    }
                }
            }
            else break;

        }

        System.out.println("Min :"+min);

    }
}
