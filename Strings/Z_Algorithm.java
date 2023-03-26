package DSAPractice;
import java.util.Scanner;
public class Z_Algorithm {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int n= sc.nextInt();

        System.out.println("Enter a string:");
        char [] s= new char[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next().charAt(0);
        }

        //Brute force

        /*int len=0;
        int i,j;
        int prefixLen[]= new int[n];
        for(i=0;i<n;i++)
        {
            len=0;
            j=i;
            while(j<n && s[j]==s[j-i])
            {
                len++;
                j++;
            }
            prefixLen[i]+=len;
            System.out.println("Prefix length of"+i+ "th index is"+prefixLen[i]);
        }
          */

        // using Z-Algorithm

        int len=0,boxlen=0,i,j,boxLeft=0,boxRight=0;
        int prefixLen[]= new int[n];
        prefixLen[0]=n;
        for(i=1;i<n;i++)
        {
            len=0;
            j=i;
            //System.out.println("i:"+i);
            //System.out.println("Box length :"+boxlen);
            //System.out.println("Length:"+len);
            if(prefixLen[j-boxLeft] < boxlen)
            {
                //System.out.println("Len Allocated in if");
                len=prefixLen[j-boxLeft];

            }
            else if(boxlen>0)
            {

                //System.out.println("In if else:");
                //System.out.println("PrefixLen:"+prefixLen[j-boxLeft]);
                if( prefixLen[j-boxLeft] <(n-i))
                {

                    len= boxlen;
                }

                else
                {
                    len= n-i;
                }
                int index = j-boxLeft;
                //System.out.println("Len Added of"+ index +" th index"+" Len "+ len);
                j= i+len;
                while(j<n && s[j]==s[j-i] )
                {
                    len++;
                    //System.out.println("len incremented:"+len);
                    j++;
                }
            }
            else
            {
                //System.out.println("In else:");
                while(j<n && s[j]==s[j-i])
                {

                    len++;
                    j++;
                }

                //System.out.println("Length updated to "+len +" in else");
            }
            if(boxlen<len)
            {
                boxlen=len;
                boxLeft=i;
            }

            if(boxlen>0)
            {
                boxlen--;
            }
            prefixLen[i]=len;
            System.out.println("PrefixLen["+i+ "] ->"+prefixLen[i]);
            //System.out.println("----------------------------------------");
        }

        for( i=0;i<n;i++)
        {
            System.out.print(prefixLen[i]+" ");
        }
    }
}
