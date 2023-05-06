package DSAPractice;

import java.util.HashMap;

//Find the count of right angled triangle such that the base and perpendicular are parallel to either X or Y-axis?
//
// Given two arrays of integers A and B of size N each, where each pair (A[i], B[i]) for 0 <= i < N
// represents a unique point (x, y) in 2D Cartesian plane.
//
// Find and return the number of unordered triplets (i, j, k) such that (A[i], B[i]), (A[j], B[j]) and (A[k], B[k])
// form a right angled triangle with the triangle having one side parallel to the x-axis and one side parallel to the y-axis.
//
// Note: The answer may be large so return the answer modulo (10^9 + 7).
//
// Here is the link of the problem on InterviewBit: https://www.interviewbit.com/problems/count-right-triangles

public class CountRightTriangles {
    static int RightAngled(int a[][], int n)
    {


        HashMap<Integer,
                        Integer> xpoints  = new HashMap<Integer,
                Integer>();
        HashMap<Integer,
                Integer> ypoints  = new HashMap<Integer,
                Integer>();

        for (int i = 0; i < n; i++)
        {
            if(xpoints.containsKey(a[i][0]))
            {
                xpoints.put(a[i][0], xpoints.get(a[i][0]) + 1);
            }
            else
            {
                xpoints.put(a[i][0], 1);
            }
            if(ypoints.containsKey(a[i][1]))
            {
                ypoints.put(a[i][1], ypoints.get(a[i][1]) + 1);
            }
            else
            {
                ypoints.put(a[i][1], 1);
            }
        }


        int count = 0;


        for (int i = 0; i < n; i++)
        {
            if (xpoints.get(a[i][0]) >= 1 &&
                    ypoints.get(a[i][1]) >= 1)
            {


                count += (xpoints.get(a[i][0]) - 1) *
                        (ypoints.get(a[i][1]) - 1);
            }
        }


        return count;
    }

    public static void main(String[] args)
    {
        int N = 5;

        int arr[][] = { { 1, 2 }, { 2, 1 },
                { 2, 2 }, { 2, 3 },
                { 3, 2 } };

        System.out.print(RightAngled(arr, N));
    }
}
