import java.util.*;
public class DiaSum
{
    public static void main(String args[])
    {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j;
        Scanner in=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int rsum=0,lsum=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                {
                    lsum+=a[i][j];
                }
                if((i+j)==2)
                {
                    rsum+=a[i][j];
                }
            }
        }
        System.out.println(lsum);
        System.out.println(rsum);
    }
}