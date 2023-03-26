package DSAPractice;
import java.util.Scanner;
public class StringReverse {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        String s;
        System.out.println("Enter a string");
        s= sc.nextLine();
        int n= s.length();
        char []temp= new char[n];

        s.getChars(0,n,temp,1);

        temp.toString();
        System.out.println(temp);
    }
}
