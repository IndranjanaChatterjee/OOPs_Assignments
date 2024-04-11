import java.util.*;
public class Fact2
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
    public static void main(String args[])
    {
        int a=5;
        int f;
        f=fact(a);
        System.out.println("Factorial "+f);
    }
}