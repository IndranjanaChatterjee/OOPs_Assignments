import java.util.*;
public class Fact3
{
    
    public static void main(String args[])
    {
        int a=5;
        int f;
        Factorial ob=new Factorial();
        f=ob.fact(a);
        System.out.println("Factorial "+f);
    }
}
class Factorial
{
    public static int fact(int f)
    {
        if(f==1)
        {
            return 1;
        }
        else
        {
            return f*fact(f-1);
        }
    }
    
}