package DSAPractice;

import java.util.Scanner;

//Maximum height of the staircase
//Given an integer A representing the square blocks. The height of each square block is 1. The task is to create a staircase of max height using these blocks. The first stair would require only one block, the second stair would require two blocks and so on. Find and return the maximum height of the staircase.
//Input Format
//The only argument given is integer A.
//Output Format
//Return the maximum height of the staircase using these blocks.
//Constraints
//0 <= A <= 10^9
//For Example
//Input 1:
//    A = 10
//Output 1:
//    4
//
//Input 2:
//    A = 20
//Output 2:
//    5
public class MaxHeightOfStairCase {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);

        int A=sc.nextInt();

        int low=0,high=A,mid,s=A;
         while(low<high)
         {
             mid=(low+high)/2;
             s=((mid+1)*mid)/2;
             if(s==A || s+mid+1 >A || s+mid-1 <A)
             {
                 System.out.println(mid);
             }
             else if(s<A )
             {
                 low=mid+1;
             }
             else
             {
                 high=mid-1;
             }
         }
    }
}
