import java.util.*;
public class Fact1
{
    public static void main(String args[])
    {
        int a=5;
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f*=i;
        }
        System.out.println("Factorial "+f);
    }
}