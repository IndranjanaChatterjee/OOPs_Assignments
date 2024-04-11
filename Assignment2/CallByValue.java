import java.util.*;
public class CallByValue
{
    int num=3;
    void change(int num)
    {
        num=num+10;
    }
    public static void main(String args[])
    {
        CallByValue ob=new CallByValue();
        System.out.println(ob.num);// without passing argument
        ob.change(10);// call by value
        System.out.println(ob.num);//no change
    }
}