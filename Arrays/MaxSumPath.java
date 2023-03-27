package DSAPractice;
import java.util.Scanner;
public class ProblemSolving_9_MaxSumPath {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of arrays size1 size2");
        int n1=sc.nextInt();
        int n2= sc.nextInt();
        System.out.println("Note : Both the arrays are sorted in non decreasing order.");
        System.out.println("Enter array1 elements:");
        int []a= new int[n1+1];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter array2:");
        int []b= new int[n2+1];
        for(int i=0;i<n2;i++)
        {
            b[i]=sc.nextInt();
        }
        a[n1]=b[n2]=Integer.MAX_VALUE;

        int sum1=0;
        int sum2=0;
        int ans=0;

        for(int i=0,j=0;i<=n1&& j<=n2;)
        {
            if(a[i]>b[j])
            {

                sum2+=b[j];

                System.out.println("Status : Added"+b[j]+" -> sum2 new index of array2: "+(++j)+"New array element :"+b[j]);
            }
            else if(a[i]<b[j])
            {
                sum1+=a[i];


                System.out.println("Status : Added"+a[i]+" -> sum1 new index of array1: "+(++i));
            }
            else {
                if(a[i]==Integer.MAX_VALUE)
                {
                    ans+=Math.max(sum1,sum2);
                    System.out.println("Last Added:"+Math.max(sum1,sum2));
                }

                else
                {
                    ans+=Math.max(sum1,sum2)+a[i];
                    System.out.println("Added: "+(Math.max(sum1,sum2) +a[i]));
                }

                sum1=sum2=0;
                i++;
                j++;
                System.out.println("i and j:"+i+" "+ j);
            }
        }

        System.out.println("Maximum Sum :"+ans);
    }
}
