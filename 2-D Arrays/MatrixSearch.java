package DSAPractice;

public class MatrixSearch {
    public static void main(String[] args)
    {
        int [][]matrix={
                {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}
        };

        int lowi=0,lowj=0,highi=2,highj=2,midi,midj;

        int key=6;
        int flag=0;
        while(lowi<=highi)
        {
            midi=(lowi+highi)/2;

            if(matrix[midi][0]<=key && matrix[midi][2]>=key)
            {
                if(key== matrix[midi][0]|| key==matrix[midi][2])
                {
                    System.out.println("Found");
                    break;
                }
                else
                {

                    while(lowj<=highj)
                    {
                        midj=(lowj+highj)/2;
                        if(matrix[midi][midj]==key)
                        {
                            System.out.println("found");
                            flag=1;
                            break;
                        }
                        else {
                            if(matrix[midi][midj] <key)
                            {
                                lowj=midj+1;
                            }
                            else
                            {
                                highj=midj-1;
                            }
                        }
                        if(flag==1)
                            break;
                    }
                }
            }
        }



        /*
        for(key=1;key<26;key++)
        {
            lowi=0;
            lowj=0;
            highi=4;
            highj=4;
            int n=matrix.length;
            int m= matrix[0].length;
            int flag=0;
            int count=0;
            while(lowi<=highi && lowj<=highj)
            {
                midi=(lowi+highi)/2;
                midj=(lowj+highj)/2;
                count++;
                if(matrix[midi][midj]==key)
                {
                    System.out.println("Found in :"+count+" steps.");
                    flag=1;
                    break;
                }
                else if(matrix[midi][midj] < key)
                {
                    if(midj<m-1)
                    {
                        lowj= midj+1;
                    }
                    else
                    {
                        lowi=lowi+1;
                        lowj=0;
                    }
                }
                else
                {
                    if(midj>0)
                    {
                        highj= midj-1;

                    }
                    else
                    {
                        highi= highi-1;
                        highj=m-1;
                    }
                }

            }
            if(flag==0)
            {
                System.out.println("Not found");
            }
        }
        */
    }
}
