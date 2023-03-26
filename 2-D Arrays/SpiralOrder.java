package DSAPractice;

public class SpiralOrder {
    public static void main(String[] args) {
        // for a given matrix print the elements in speherical order

        int [][] arr= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int T=0,B=3,L=0,R=2,k;

        while(T<=B && L<=R)
        {
            for(k=L;k<=R;k++)
            {
                System.out.println("''"+"L:"+L+"R:"+R+"T:"+T+"B:"+B+"''");
                System.out.println("---------------");
                System.out.println("L1:"+arr[T][k]);
            }
            T++;

            for(k=T;k<=B&&L<=R;k++)
            {
                System.out.println("''"+"L:"+L+"R:"+R+"T:"+T+"B:"+B+"''");
                System.out.println("---------------");
                System.out.println("L2:"+arr[k][R]);
            }
            R--;

            for(k=R;k>=L&&T<=B;k--)
            {
                System.out.println("''"+"L:"+L+"R:"+R+"T:"+T+"B:"+B+"''");
                System.out.println("---------------");
                System.out.println("L3:"+arr[B][k]);
            }
            B--;

            for(k=B;k>=T;k--)
            {
                System.out.println("''"+"L:"+L+"R:"+R+"T:"+T+"B:"+B+"''");
                System.out.println("---------------");
                System.out.println("L4:"+arr[k][L]);
            }


            L++;
        }
    }
}
