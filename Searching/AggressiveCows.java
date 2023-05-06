package DSAPractice;

import java.util.Arrays;

//Aggressive cows
//Problem Description
//Farmer John has built a new long barn, with N stalls. Given an array of integers A of size N where each element of the array represents the location of the stall, and an integer B which represent the number of cows. His cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
//Problem Constraints
//2 <= N <= 100000
//0 <= A[i] <= 109
//2 <= B <= N
//Input Format
//The first argument given is the integer array A.
//The second argument given is the integer B.
//Output Format
//Return the largest minimum distance possible among the cows.
//Example Input
// A = [1, 2, 3, 4, 5]
// B = 3
//Example Output
// 2
//Example Explanation
// John can assign the stalls at location 1,3 and 5 to the 3 cows respectively.
// So the minimum distance will be 2
//
//
public class AggressiveCows {

    static boolean isPossible(int a[], int n, int cows, int minDist) {
        int cntCows = 1;
        int lastPlacedCow = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] - lastPlacedCow >= minDist) {
                cntCows++;
                lastPlacedCow = a[i];
            }
        }
        if (cntCows >= cows) return true;
        return false;
    }
    public static void main(String args[]) {
        int n = 5, cows = 3;
        int a[]={1,2,8,4,9};
        Arrays.sort(a);

        int low = 1, high = a[n - 1] - a[0];

        while (low <= high) {
            int mid = (low + high) >> 1;

            if (isPossible(a, n, cows, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("The largest minimum distance is " + high);


    }
}
