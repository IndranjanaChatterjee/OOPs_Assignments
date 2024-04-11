import java.util.*;
class Mythread implements Runnable
{
public void run()
{
System.out.println("Thread is running");
}
}
public class Trunnable
{
public static void main(String args[])
{
Mythread t=new Mythread();
Thread t1=new Thread(t);
t1.start();
}
}