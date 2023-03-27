package DSAPractice;
import java.util.*;

public class GenerateAllSubsets {
    int [] arr;
    int n;
    int unique;
    TreeMap<Integer,Integer> t= new TreeMap();
    int [] freq;
    void generateUniqueSubsets(ArrayList<Integer> temp,int ind, int[] freq)
    {

        if(ind==n)
        {
              for(int i=0;i<unique;i++)
              {
                  for(int j=0;j<freq[i];j++)
                  {
                      System.out.println("Start at line 19");
                  }
              }
        }
    }


    public static void main(String [] args)
    {
        System.out.println("Enter size of the array:");
        GenerateAllSubsets g= new GenerateAllSubsets();
        Scanner sc= new Scanner(System.in);
        g.n= sc.nextInt();

        System.out.println("Enter array elements:");
        g.arr= new int[g.n];
        for(int i=0;i<g.n;i++)
        {
            g.arr[i]=sc.nextInt();
        }

        int unique=0;
        for(int i=0;i<g.n;i++)
        {
            if(g.t.containsKey(g.arr[i]))
            {
                g.t.put(g.arr[i], g.t.get(g.arr[i])+1);
            }
            else
            {
                g.t.put(g.arr[i],1);
                unique+=1;
            }
        }
        g.unique=unique;
        g.freq= new int[unique];

        Arrays.fill(g.freq,0);



    }
}
