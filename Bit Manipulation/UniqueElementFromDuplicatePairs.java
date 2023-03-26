import java.util.Scanner;
public class UniqueElementFromDuplicatePairs {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n= sc.nextInt();
        System.out.println("Enter array elements:");

        int [] a= new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        if(a[0]!=a[1])
        {
            System.out.println("Unique element is:"+a[0]);
        }
        else if(a[n-1]!=a[n-2])
        {
            System.out.println("Unique Element is:"+a[n-1]);
        }
        else
        {
            int low=1,high=n-2;
            int  mid;

            while(low <=high) {
                mid = (low + high) / 2;
                if (a[mid] == a[mid - 1]) {
                    if (((mid - 1) + 2) % 2 == 0) {
                        low = mid + 1;
                    }
                    else
                    {
                        high=mid-1;
                    }
                }
                else if(a[mid]==a[mid+1])
                {
                    if((n-1-mid-1)%2==0)
                    {
                        high=mid-1;
                    }
                    else
                    {
                        low=mid+1;
                    }

                }
                else
                {
                    System.out.println("Unique element :"+a[mid]);
                    break;
                }
            }
        }
    }
}
