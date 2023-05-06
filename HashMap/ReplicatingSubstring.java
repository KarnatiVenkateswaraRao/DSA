package DSAPractice;

//Replicating Substring
//Given a string S, find if it is possible to re-order the characters of the string S so that it can be represented as a
//concatenation of K similar strings. Eg if S=aabb and K=2, then it is possible to re-arrange the string as "abab" which is a
//concatenation of 2 similar strings "ab". If it is possible, return 1, else return -1.
//
//Constraints:
//1.   1 <= Length of S <= 1000
//2.   All the alphabets of S are lower case (a - z)
//3.   1 <= K <= 1000
//
//Input: Integer K and string S Output: Your function should return 1 if it is possible to re-arrange the characters of the string S so that it can be represented as a concatenation of K similar strings. If it is not, return -1. Example: Input:
//K:2
//S:bbaabb

import java.util.HashMap;

//Replicating Substring
//Given a string S, find if it is possible to re-order the characters of the string S so that it can be represented as a
//concatenation of K similar strings. Eg if S=aabb and K=2, then it is possible to re-arrange the string as "abab" which is a
//concatenation of 2 similar strings "ab". If it is possible, return 1, else return -1.
//
//Constraints:
//1.   1 <= Length of S <= 1000
//2.   All the alphabets of S are lower case (a - z)
//3.   1 <= K <= 1000
//
//Input: Integer K and string S Output: Your function should return 1 if it is possible to re-arrange the characters of the string S so that it can be represented as a concatenation of K similar strings. If it is not, return -1. Example: Input:
//K:2
//S:bbaabb
//
//Output:
//1

public class ReplicatingSubstring {
    public int solve(int A, String B) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<B.length(); i++){
            Character ch = B.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,(map.get(ch))+1);
            }
        }

        for(Character i : map.keySet()){
            int val = map.get(i);
            if((val % A) != 0) {
                return -1;
            }
        }

        return 1;
    }
}
