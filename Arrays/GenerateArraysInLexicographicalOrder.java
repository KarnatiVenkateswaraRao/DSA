package DSAPractice;
import java.util.ArrayList;
public class GenerateArraysInLexicographicalOrder {
    static int n=3;
    static void generateBinaryArrays(ArrayList<Integer> al,int i) {
        if (n == i) {
            System.out.println(al);

            return;
        }
        //System.out.println("al:"+al);
        //System.out.println("Pushing 0");
        al.add(0);
        generateBinaryArrays(al, i + 1);
        //System.out.println("Removing 0");
        al.remove(i);
        //System.out.println("al :"+al);
        //System.out.println("Pushing 1");
        al.add(1);
        generateBinaryArrays(al, i + 1);
        //System.out.println("Removing 1");
        al.remove(i);
        //System.out.println("al:"+al);

    }

    public static void main(String [] args)
    {
        ArrayList<Integer> al = new ArrayList();
        generateBinaryArrays(al,0);

    }
}
