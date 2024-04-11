import java.util.*;
public class Prime
{
    int checkPalin(int a)
    {
        int i;
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        Prime ob=new Prime();
        int check=ob.checkPalin(num);
        if(check==1)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
        
    }
}