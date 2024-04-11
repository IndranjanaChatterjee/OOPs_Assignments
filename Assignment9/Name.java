class NameThread extends Thread
{
NameThread(String name)
{
super(name);
}
public void run()
{
try
{
Thread.sleep(500);
System.out.println("Running :"+Thread.currentThread().isAlive());
}
catch(Exception e)
{
System.out.println("e");
}
}
}
public class Name
{
public static void main(String args[])
{
NameThread t1=new NameThread("first");
System.out.println("Thread :"+t1.getName());
t1.start();
}
}  