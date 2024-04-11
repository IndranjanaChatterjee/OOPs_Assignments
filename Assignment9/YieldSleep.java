import java.lang.*;

public class YieldSleep implements Runnable
{
    public void run()
    {
        int i;
        try
        {
        for(i=0;i<5;i++)
        {
         Thread.sleep(1000);
         System.out.println(i);
        }
        }
        catch(Exception e)
{
 System.out.println(e);
}
    }
    public static void main (String[] args)
    {
        YieldSleep y1 = new YieldSleep();
        
        Thread t1 = new Thread(y1);
        
       
        
       
        t1.start();
        
    }
}