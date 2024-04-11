public class AliveThread extends Thread
{
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
public static void main(String args[])
{
AliveThread a=new AliveThread();
System.out.println("before starting thread isAlive: "+a.isAlive());  
a.start();  
System.out.println("after starting thread isAlive: "+a.isAlive());
}
}  