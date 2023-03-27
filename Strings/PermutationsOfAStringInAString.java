package DSAPractice;
import java.util.Scanner;
import java.util.HashMap;
public class PermutationsOfAStringInAString {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter strings");
        String A= sc.nextLine();
        String B= sc.nextLine();
        int n= A.length();
        int m= B.length();
        HashMap<Character, Integer> h1= new HashMap();
        HashMap<Character,Integer> h2= new HashMap();
        for(int i=0;i<n;i++)
        {
            if(h1.containsKey(A.charAt(i)))
            {
                h1.put(A.charAt(i), h1.get(A.charAt(i))+1);
            }
            else
                h1.put(A.charAt(i),1);
        }

        System.out.println( h1);
        int l=0,r=n-1;

        // l and r are two pointers we need to insert l to r elements in hashmap

        for(int i=l;i<=r;i++)
        {
            if(h2.containsKey(B.charAt(i)))
            {
                h2.put(B.charAt(i), h2.get(B.charAt(i))+1);
            }
            else
                h2.put(B.charAt(i),1);
        }
        int a= h2.get(B.charAt(l));
        System.out.println("a:"+a);

        int count=0;
        l=0;
        while(true)
        {
            if(h1.equals(h2))
            {
                count++;
            }
            System.out.println(count+" Count");
            System.out.println("b char at:"+B.charAt(l));
            System.out.println("l:"+l);
            System.out.println("r:"+r);
            if(h2.get(B.charAt(l))>1)
            {
                h2.put(B.charAt(l),h2.get(B.charAt(l))-1);
            }
            else
                h2.remove(B.charAt(l));
            l++;
            if(r<m-1)
                r++;
            else
                break;
            if(h2.containsKey(B.charAt(r)))
            {
                h2.put(B.charAt(r), h2.get(B.charAt(r))+1);
            }
            else
                h2.put(B.charAt(r),1);

        }

        System.out.println("No of permutations :"+count);


    }
}
