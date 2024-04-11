import java.util.*;
public class ThisCon
{
    ThisCon()
    {
        System.out.println("Hi");
    }
    ThisCon(int a)
    {
        this();
    }
    public static void main(String args[])
    {
        ThisCon ob=new ThisCon(5);
        
    }
}