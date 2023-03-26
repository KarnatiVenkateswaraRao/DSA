package DSAPractice;

import java.util.HashMap;

public class SumOfPairs {
    public static void main(String [] args)
    {
        int [] array= new int[]{1,5,3,7,9,8,10};
        int goal=13;
        HashMap<Integer,Integer> hashMap= new HashMap<Integer,Integer>();

        for(int i=0;i<array.length;i++)
        {
            if(hashMap.containsKey(array[i]))
            {
                hashMap.put(array[i],hashMap.get(array[i])+1);
            }
            else
            {
                hashMap.put(array[i],1);
            }
        }
        System.out.println(hashMap);

        for(int i=0;i<array.length;i++)
        {
            if(hashMap.containsKey(goal-array[i])&& hashMap.get(goal-array[i])>0)
            {
                System.out.println(array[i]+" "+(goal-array[i]));
                hashMap.put(array[i],hashMap.get(array[i])-1);
                hashMap.put(goal-array[i],hashMap.get(goal-array[i])-1);
            }
        }

    }
}
