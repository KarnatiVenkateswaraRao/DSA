package DSAPractice;

import java.util.Arrays;

//Matrix Median
//Given a matrix of integers A of size N x M in which each row is sorted. Find an return the overall median of the matrix A. Note: No extra memory is allowed. Note: Rows are numbered from top to bottom and columns are numbered from left to right.
//Input Format
//The first and only argument given is the integer matrix A.
//Output Format
//Return the overall median of the matrix A.
//Constraints
//1 <= N, M <= 10^5
//1 <= N*M  <= 10^6
//1 <= A[i] <= 10^9
//N*M is odd
//For Example
//Input 1:
//    A = [   [1, 3, 5],
//            [2, 6, 9],
//            [3, 6, 9]   ]
//Output 1:
//    5
//Explanation 1:
//    A = [1, 2, 3, 3, 5, 6, 6, 9, 9]
//    Median is 5. So, we return 5.
//
//Input 2:
//    A = [   [5, 17, 100]    ]
//Output 2:
//    17

public class MatrixMedian {
    static int binaryMedian(int m[][], int r, int c)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            if (m[i][0] < min)
                min = m[i][0];
            if (m[i][c-1] > max)
                max = m[i][c-1];
        }

        int desired = (r * c + 1) / 2;
        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0;
            int get = 0;


            for (int i = 0; i < r; ++i) {

                get = Arrays.binarySearch(m[i], mid);


                if (get < 0)
                    get = Math.abs(get) - 1;


                else {
                    while (get < m[i].length
                            && m[i][get] == mid)
                        get += 1;
                }

                place = place + get;
            }

            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }


    public static void main(String[] args)
    {
        int r = 3, c = 3;
        int m[][]
                = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };

        System.out.println(binaryMedian(m, r, c));
    }
}
