import java.util.*;
public class Palin
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int store=n;
        int a=0,r;
        while(n!=0)
        {
            r=n%10;
            a=(a*10)+r;
            n=n/10;
            
        }
        if(a==store)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
    
}