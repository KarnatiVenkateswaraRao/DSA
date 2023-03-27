package DSAPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class SubArrayWithSum0 {

    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        HashMap<Integer, ArrayList<Integer>> pSum= new HashMap<Integer, ArrayList<Integer>>();

        System.out.println("enter size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter "+n+"elements to the array");
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(i==n-1)
            {
                System.out.println("Here you go...");
            }
        }
        ArrayList  a1List = new ArrayList();
        a1List.add(-1);
        pSum.put(0,a1List);

        int [] prefixSum= new int[n];
        prefixSum[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            prefixSum[i]= prefixSum[i-1]+arr[i];

        }
        for(int i=0;i<n;i++)
        {
            if(pSum.containsKey(prefixSum[i]))
            {
                System.out.println(" there exists a sub array with sum 0 and that stats with :");

                for(Integer v : pSum.get(prefixSum[i]))
                {
                   // System.out.println("we are in the for loop");
                    System.out.println((v +1 + " to "+ i));

                }

                ArrayList aList= pSum.get(prefixSum[i]);
                aList.add(i);
                pSum.put(prefixSum[i],aList);

            }
            else {
                ArrayList aList= new ArrayList();
                aList.add(i);
                pSum.put(prefixSum[i],aList);

            }
        }
        System.out.println(pSum);
    }

}
