package DSAPractice;

import java.util.Arrays;

public class MatrixMedian {
    public static void main(String [] args)
    {
      int [][] matrix= {
                            {1,4,5},{2,6,9},{3,6,9}
                        };

      int get= Arrays.binarySearch(matrix[1],9);
      System.out.println("get:"+get);
    }
}
