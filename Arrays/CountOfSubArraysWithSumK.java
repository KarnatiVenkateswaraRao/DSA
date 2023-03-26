package DSAPractice;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class CountOfSubArraysWithSumK {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, ArrayList<Integer>> pSum= new HashMap();

        ArrayList a= new ArrayList();
        a.add(-1);
        pSum.put(0,a);
        System.out.println("enter size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter sum value :");
        int k= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int [] prefixSum= new int[n];
        prefixSum[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            prefixSum[i]=prefixSum[i-1]+arr[i];
           // System.out.println(prefixSum[i]);

        }

        //System.out.println(prefixSum);

        for(int i=0;i<n;i++) {
            if (pSum.containsKey(prefixSum[i] - k)) {
                System.out.println(" there exists a sub array with sum 0 and that stats with :");

                for (Integer v : pSum.get(prefixSum[i] - k)) {
                    // System.out.println("we are in the for loop");
                    System.out.println((v + 1 + " to " + i));

                    count+=1;

                }

            }

            if(pSum.containsKey(prefixSum[i]))
            {
                ArrayList aList = pSum.get(prefixSum[i]);
                aList.add(i);
               // System.out.println(" If Added "+i+" to "+(prefixSum[i]));
                //System.out.println(pSum);
                pSum.put(prefixSum[i], aList);
            }
            else {
                ArrayList aList = new ArrayList();
                aList.add(i);
                //System.out.println("Else Added "+i+" to "+prefixSum[i]);
                //System.out.println(pSum);
                pSum.put(prefixSum[i], aList);
            }
        }
        System.out.println("No of sub arrays with sum "+k+" is "+count);
        System.out.println(pSum);
    }
}
