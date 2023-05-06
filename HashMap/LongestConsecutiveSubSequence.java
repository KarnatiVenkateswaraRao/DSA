package DSAPractice;

import java.util.HashSet;

//Longest Consecutive Sequence
//        Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
//
//        Example: Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is [1, 2, 3, 4].
//        Return its length: 4. Your algorithm should run in O(n) complexity
public class LongestConsecutiveSubSequence {
    static int findLongestConseqSubsequence(int arr[], int n)
    {
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;


        for (int i = 0; i < n; ++i)
            S.add(arr[i]);


        for (int i = 0; i < n; ++i) {

            if (!S.contains(arr[i] - 1)) {

                int j = arr[i];
                while (S.contains(j)){
                    S.remove(Integer.valueOf(j));
                    j++;
                }


                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;
    }

    // Driver Code
    public static void main(String args[])
    {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        System.out.println(
                "Length of the Longest consecutive subsequence is "
                        + findLongestConseqSubsequence(arr, n));
    }
}
