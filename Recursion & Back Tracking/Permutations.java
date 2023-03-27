package DSAPractice;

import java.util.ArrayList;

public class Permutations {
    int [] arr= {1,2,3};
    int n=3;
    ArrayList<ArrayList> uniquePermutations= new ArrayList();
    void permutate(int []temp, int j)
    {
        if(j==n)
        {

            return;
        }


        for(int i=0;i<n;i++)
        {
            if(temp[i]==-1)
            {
                temp[i]=arr[j];
                permutate(temp,j+1);
                temp[i]=-1;
            }
        }

    }

    public static void main(String [] args)
    {
        int [] temp={-1,-1,-1};
        Permutations p= new Permutations();
        p.permutate(temp,0);
        System.out.println("Permutations are:");


    }
}
