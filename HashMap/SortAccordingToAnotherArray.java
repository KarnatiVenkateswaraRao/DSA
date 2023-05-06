package DSAPractice;

import java.util.HashMap;

//Sort an array according to the order defined by another array
//Given two array of integers A and B, Sort A in such a way that the relative order among the elements will be the same as those are
//in B. For the elements not present in B, append them at last in sorted order. Return the array A after sorting from the above method.
//
//Note: Elements of B are unique.
//
//Input Format
//The first argument given is the integer array A.
//The second argument given is the integer array B.
//Output Format
//Return the array A after sorting as described.
//Constraints
//1 <= length of the array A <= 100000
//1 <= length of the array B <= 100000
//-10^9 <= A[i] <= 10^9
//For Example
//Input 1:
//    A = [1, 2, 3, 4, 5]
//    B = [5, 4, 2]
//Output 1:
//    A = [5, 4, 2, 1, 3]
//
//Input 2:
//    A = [5, 17, 100, 11]
//    B = [1, 100]
//Output 2:
//    [100, 5, 11, 17]
//
public class SortAccordingToAnotherArray {
    static void sortA1ByA2(int A1[], int N, int A2[], int M,
                           int ans[])
    {
        HashMap<Integer, Integer> mp = new HashMap<>();

        int ind = 0;


        for (int i = 0; i < N; i++) {
            if (!mp.containsKey(A1[i]))
                mp.put(A1[i], 1);
            else
                mp.put(A1[i], mp.get(A1[i]) + 1);
        }



        for (int i = 0; i < M; i++) {



            if (mp.containsKey(A2[i])) {


                for (int j = 1; j <= mp.get(A2[i]); j++)
                    ans[ind++] = A2[i];
            }


            mp.remove(A2[i]);
        }


        for (HashMap.Entry<Integer, Integer> it :
                mp.entrySet()) {

            for (int j = 1; j <= it.getValue(); j++)
                ans[ind++] = it.getKey();
        }
    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int A2[] = { 2, 1, 8, 3 };
        int n = A1.length;
        int m = A2.length;


        int ans[] = new int[n];
        sortA1ByA2(A1, n, A2, m, ans);


        printArray(ans, n);
    }


}
