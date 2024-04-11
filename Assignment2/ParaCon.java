import java.util.*;
public class ParaCon
{
    int c;
    ParaCon(int c)
    {
        this.c=c;
    }
    public  int add(int a,int b)
    {
        c=a+b;
        return (c);
        
        
    }
    public static void main(String args[])
    {
        ParaCon ob=new ParaCon(0); // Parameterised Constructor
        int sum=ob.add(5,6);// returning value from caller method
        System.out.println(sum);
        
    }
}