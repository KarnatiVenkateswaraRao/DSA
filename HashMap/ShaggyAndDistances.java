package DSAPractice;

import java.util.HashMap;

public class ShaggyAndDistances {
    static int minimumDistance(int[] a)
    {

        HashMap<Integer, Integer> hmap
                = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;


        int previousIndex = 0, currentIndex = 0;


        for (int i = 0; i < a.length; i++) {

            if (hmap.containsKey(a[i])) {
                currentIndex = i;

                previousIndex = hmap.get(a[i]);

                minDistance
                        = Math.min(
                        (currentIndex - previousIndex),
                        minDistance);
            }

            hmap.put(a[i], i);
        }


        return (
                minDistance == Integer.MAX_VALUE
                        ? -1
                        : minDistance);
    }

    public static void main(String args[])
    {

        int a1[] = { 1, 2, 3, 2, 1 };
        System.out.println(minimumDistance(a1));

        int a2[] = { 3, 5, 4, 6, 5, 3 };
        System.out.println(minimumDistance(a2));

        int a3[] = { 1, 2, 1, 4, 1 };
        System.out.println(minimumDistance(a3));
    }
}
