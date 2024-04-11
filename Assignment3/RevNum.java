import java.util.*;
public class RevNum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0,r;
        while(n!=0)
        {
            r=n%10;
            a=(a*10)+r;
            n=n/10;
            
        }
        System.out.println(a);
    }
    
}