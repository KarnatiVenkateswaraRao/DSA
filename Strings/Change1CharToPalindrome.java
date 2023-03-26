package DSAPractice;
import java.util.Scanner;
public class Change1CharToPalindrome {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        // Condition is if the given word can be changed to palindrome by changing exactly one letter.
        //Return true or false.
        System.out.println("enter a word");
        String word= sc.next();
        int count=0;
        char l;
        char r;
        int n= word.length();
        for(int i=0;i<n/2;i++)
        {
            l= word.charAt(i);
            r=word.charAt(n-i-1);
            if( !(Character.valueOf(l).equals(Character.valueOf(r) )))
            {
                count++;
            }
        }

        if(count>1)
        {
            System.out.println(" If False count:"+count);
        }
        else if(count == 0 && n%2==0)
        {
            System.out.println(" Else If False count"+count);
        }
        else {
            System.out.println("True");
        }


    }
}
