package DSAPractice;


//Given a sorted and rotated array
//arr[] of size N and a key, the task is to find the key in the array.
//Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 3
//Output : 8
//Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 30
//Output : -1
public class SearchInRotatedSortedArray {

    static int search(int arr[], int l, int h, int key)
    {
        if (l > h)
            return -1;

        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;


        if (arr[l] <= arr[mid]) {

            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);

            return search(arr, mid + 1, h, key);
        }


        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);

        return search(arr, l, mid - 1, key);
    }

    public static void main(String args[])
    {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int n = arr.length;
        int key = 3;
        int i = search(arr, 0, n - 1, key);
        if (i != -1)
            System.out.println( i);
        else
            System.out.println(-1);
    }
}
