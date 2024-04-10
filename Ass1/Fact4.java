import java.util.*;
public class Fact4
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
        int a=Integer.parseInt(args[0]);
        int f;
        f=fact(a);
        System.out.println("Factorial "+f);
    }
}