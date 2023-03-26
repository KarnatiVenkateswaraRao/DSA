package DSAPractice;
import java.util.Scanner;
import java.util.ArrayList;
public class ConstructArrayWithXandY {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter X and Y :");
        int x= sc.nextInt();
        int y= sc.nextInt();

        System.out.println("Enter size of the array to be constructed:");
        int k= sc.nextInt();
        int d=y-x;

        ArrayList<Integer> tempA= new ArrayList();
        ArrayList<Integer> tempB= new ArrayList();
        int val=y;
        int minMax=Integer.MAX_VALUE;
        int tempMax=Integer.MAX_VALUE,tempMin=Integer.MAX_VALUE;
        int tempD=d;
        int min=Integer.MAX_VALUE;
        int fd=d;
        int n;
        for(int i=1;i<k;i++)
        {
            tempD=d/i;
            n=k;
            val=y;

            System.out.println("TempD :"+tempD+" N:"+n+" Val:"+val);
            while(val>0 && n>0)
            {
                tempA.add(val);
                tempMin=Math.min(tempMin,val);
                System.out.println("Added to A :"+val);
                val=val-tempD;


                n--;
            }
            System.out.println("A"+tempA);
            if(!tempA.contains(x))
            {
                continue;
            }

            fd=Math.min(fd,tempD);
            val=y;
            while(n>0)
            {
                tempB.add(val+tempD);
                tempMax=Math.min(tempMax,val);
                System.out.println("Added to B:"+(val+tempD));
                val=val+tempD;
                n--;
            }

            if(tempMax<minMax)
            {


                minMax=tempMax;
                min=tempMin;
            }
            tempA.clear();
            tempB.clear();
        }

        for(int i=0;i<k;i++)
        {
            System.out.println("->"+(min+(i*fd)));
        }

        System.out.println("MIN:"+min);
        System.out.println("Max:"+minMax);
    }

}
