package DSAPractice;

import java.util.Scanner;
class ReverseSentense
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String []  sentence= sc.nextLine().split(" ");
        String temp;
        int n= sentence.length;
        for(int i=0;i< n/2; i++)
        {
            temp= sentence[i];
            sentence[i]=sentence[n-i-1];
            sentence[n-i-1]=temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(sentence[i]);
            if(i<n-1)
            {
                System.out.print(" ");
            }
        }


    }

}