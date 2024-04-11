import java.util.*;
public class CallByRef
{
    int num=3;
    void change(CallByRef ob)//passing obj as parameter
    {
        ob.num=ob.num+10;
    }
    public static void main(String args[])
    {
        CallByRef ob=new CallByRef();
        System.out.println(ob.num);// without passing argument
        ob.change(ob);// call by reference
        System.out.println(ob.num);//change
    }
}