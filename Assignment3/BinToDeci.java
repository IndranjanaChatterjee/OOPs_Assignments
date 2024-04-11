import java.util.*;
public class BinToDeci
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),i;
        int length = (int) (Math.log10(n) + 1);
        int deci=0,r;
        for(i=0;i<length;i++)
        {
            r=n%10;
            deci=deci+(r*(int)(Math.pow(2,i)));
            n=n/10;
        }
        System.out.println("Decimal :"+deci);
    }
    
}