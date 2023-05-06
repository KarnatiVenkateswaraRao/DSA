package DSAPractice;

import java.util.HashMap;
import java.util.Map;

//Window String
//Problem Description
//Given a string A and a string B, find the window with minimum length in A which will contain all the characters in B in linear time complexity.
//Note that when the count of a character c in B is x, then the count of c in minimum window in A should be at least x.
//Note:
//If there is no such window in A that covers all characters in B, return the empty string.
//If there are multiple such windows, return the first occurring minimum window ( with minimum start index )
//Problem Constraints
//1 <= size(A), size(B) <= 106
//Input Format
//First argument is a string A.
//Second argument is a string B.
//Output Format
//Return a string denoting the minimum window.
//Example Input
//Input 1:
// A = "ADOBECODEBANC"
// B = "ABC"
//Input 2:
// A = "Aa91b"
// B = "ab"
//Example Output
//Output 1:
// "BANC"
//Output 2:
// "a91b"
//Example Explanation
//Explanation 1:
// "BANC" is a substring of A which contains all characters of B.
//Explanation 2:
// "a91b" is the substring of A which contains all characters of B.
public class WindowString {
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        if (s.isEmpty() || p.isEmpty())
            return "-1";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int i = 0, j = 0, count = map.size();
        int left = 0, right = 0, min = s.length();
        boolean found = false;

        while (j < s.length()) {
            char endchar = s.charAt(j++);
            if (map.containsKey(endchar)) {
                map.put(endchar, map.get(endchar) - 1);
                if (map.get(endchar) == 0)
                    count -= 1;
            }
            if (count > 0)
                continue;

            while (count == 0) {
                char strchar = s.charAt(i++);
                if (map.containsKey(strchar)) {
                    map.put(strchar, map.get(strchar) + 1);
                    if (map.get(strchar) > 0)
                        count += 1;
                }
            }
            if ((j - i) < min) {
                left = i - 1;
                right = j;
                min = j - i;

                found = true;
            }
        }
        return !found ? "-1" : s.substring(left, right);
    }
    public static void main(String[] args)
    {
        String str = "ABCDEFGHIJ";
        String pat = "ABC";

        System.out.print(smallestWindow(str, pat));
    }

}
