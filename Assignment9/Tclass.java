import java.util.*;
class Mythread extends Thread
{
public void run()
{
System.out.println("Thread is running");
}
}
public class Tclass
{
public static void main(String args[])
{
Mythread t=new Mythread();
t.start();
}
}
