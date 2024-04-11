import java.util.*;
public class ThisMethod
{
    void print(int a)
    {
        System.out.println(a);
    }
    void send(int b)
    {
        this.print(b);
    }
    public static void main(String args[])
    {
        ThisMethod ob=new ThisMethod();
        ob.send(5);
    }
}