package DSAPractice;
import java.util.Scanner;
public class SumOfSubMatrix {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of row first matrix");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int flag = 0;
        if (m <= 1000 && m >= 1 && n <= 1000 && n >= 1) {
            int a[][] = new int[n][m];

            System.out.println("enter matrix elements");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    if (a[i][j] > 100000 || a[i][j] < -100000) {

                        System.out.println("value should be between -100000 and 100000");
                        System.exit(1);
                    }
                }

            }
            System.out.println("The Matrix is:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j]);

                }
                System.out.println();
            }
            System.out.println("enter no of queris");
            int q = sc.nextInt();
            System.out.println("enter array B");
            int[] b = new int[q];
            for (int i = 0; i < q; i++) {
                b[i] = sc.nextInt();
                if ( b[i]<1 || b[i]>n) {

                    System.out.println(" invalid value ");
                    System.exit(1);
                }
            }
            System.out.print(" B:");
            for (int i = 0; i < q; i++) {
                System.out.print(b[i] +" ");

            }


            System.out.println("enter array C");
            int[] c = new int[q];
            for (int i = 0; i < q; i++) {
                c[i] = sc.nextInt();
                if ( c[i]<1 || c[i]>n) {

                    System.out.println(" invalid value ");
                    System.exit(1);
                }
            }
            System.out.print(" c:");
            for (int i = 0; i < q; i++) {
                System.out.print(c[i] +" ");

            }

            System.out.println("enter array D");
            int[] d = new int[q];
            for (int i = 0; i < q; i++) {
                d[i] = sc.nextInt();
                if (d[i] < b[i] || d[i]<1 || d[i]>n) {

                    System.out.println(" bottom cannot be less than top ");
                    System.exit(1);
                }
            }

            System.out.print(" D:");
            for (int i = 0; i < q; i++) {
                System.out.print(d[i] +" ");

            }

            System.out.println("enter array E");
            int[] e = new int[q];
            for (int i = 0; i < q; i++) {

                e[i] = sc.nextInt();
                if (e[i] < c[i] || e[i]<1 || e[i]>m ) {

                    System.out.println(" right cannot be less than left ");
                    System.exit(1);
                }
            }

            System.out.print(" E:");
            for (int i = 0; i < q; i++) {
                System.out.print(e[i] +" ");

            }



            int sum;
            for(int i=0;i<q;i++)
            {
                System.out.println(" query .........");
                sum=0;
                for(int j=b[i]-1;j<=d[i]-1;j++)
                {
                    for(int k=c[i]-1;k<=e[i]-1;k++)
                    {
                        System.out.print(a[j][k]+" ");
                        sum+=a[j][k];
                    }
                }

                System.out.print("Sum :"+sum+" ");
            }

        }

    }

}
