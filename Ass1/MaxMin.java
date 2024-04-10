import java.util.*;
public class MaxMin
{
    
    public static void main(String args[])
    {
        int a=5,b=2,c=10;
        
        if(a>b && b>c)
        {
            System.out.println(a+" is greatest");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is greatest");
        }
        else if(c>a && c>a)
        {
            System.out.println(c+" is greatest");
        }
    }
}