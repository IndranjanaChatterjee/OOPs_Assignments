import java.util.*;
public class ThisPassMethod
{
    void print(ThisPassMethod t1)
    {
        System.out.println("Argument");
    }
    void send(int b)
    {
        print(this);
    }
    public static void main(String args[])
    {
        ThisPassMethod ob=new ThisPassMethod();
        ob.send(5);
    }
}