import java.util.*;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int store=n;
        int arm=0,r;
        while(n!=0)
        {
            r=n%10;
            arm=arm+(r*r*r);
            n=n/10;
            
        }
        if(arm==store)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
    
}