import java.util.*;
public class ArraySum
{
    public static void main(String args[])
    {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j,k,sum=0;
        Scanner in=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
