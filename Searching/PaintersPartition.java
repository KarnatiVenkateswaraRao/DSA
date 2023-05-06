package DSAPractice;

//Painter's Partition Problem
//Problem Description
//Given 2 integers A and B and an array of integers C of size N. Element C[i] represents length of ith board.
//You have to paint all N boards [C0, C1, C2, C3 … CN-1]. There are A painters available and each of them takes B units of time to paint 1 unit of board.
// Calculate and return minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of board. NOTE:
//1. 2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.
//2. A painter will only paint contiguous boards. Which means a configuration where painter 1 paints board 1 and 3 but not 2 is invalid.
//
//Return the ans % 10000003.
//
//
//Problem Constraints
//1 <= A <= 1000
//1 <= B <= 106
//1 <= N <= 105
//1 <= C[i] <= 106
//
//
//Input Format
//The first argument given is the integer A.
//The second argument given is the integer B.
//The third argument given is the integer array C.
//
//
//Output Format
//Return minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of board % 10000003.
//
//
//Example Input
//Input 1:
// A = 2
// B = 5
// C = [1, 10]
//Input 2:
// A = 10
// B = 1
// C = [1, 8, 11, 3]
//
//
//
//Example Output
//Output 1:
// 50
//Output 2:
// 11
//
//
//
//Example Explanation
//Explanation 1:
// Possibility 1:- same painter paints both blocks, time taken = 55 units.
// Possibility 2:- Painter 1 paints block 1, painter 2 paints block 2, time take = max(5, 50) = 50
// There are no other distinct ways to paint boards.
// ans = 50%10000003
public class PaintersPartition {
    static int add(int arr[], int from, int end) {
        int total = 0;
        for (int i = from; i <= end; i++)
            total += arr[i];
        return total;
    }

    static int partition(int arr[], int M, int N) {
        // Base Cased
        if (M == 1)
            return arr[0];
        if (N == 1)
            return add(arr, 0, M - 1);

        int ans = Integer.MAX_VALUE;


        for (int i = 1; i <= M; i++)
            ans = Math.min(ans, Math.max(partition(arr, i, M - 1),
                    add(arr, i, M - 1)));

        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { 20, 50, 10, 30, 40, 80 };
        int M = arr.length;
        int N = 3;
        int res = partition(arr, M, N);
        System.out.println(res);
    }
}
