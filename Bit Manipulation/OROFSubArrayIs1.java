package DSAPractice;

public class OROFSubArrayIs1 {
    public static void main(String [] args)
    {
        int [] a={1,0,0,0,0,0,1};
        int n= 7;
        int t= n* (n+1)/2;
        int s=t;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                count++;
            }
            else
            {
                s-= count*(count+1)/2;
                count=0;
            }
        }

        System.out.println("Sum:"+s);
    }
}
