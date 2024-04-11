import java.util.*;
public class DefCon
{
    public  int add(int a,int b)
    {
        return (a+b);
        
        
    }
    public static void main(String args[])
    {
        DefCon ob=new DefCon(); // no argument constructor
        int sum=ob.add(5,6);
        System.out.println(sum);
        
    }
}