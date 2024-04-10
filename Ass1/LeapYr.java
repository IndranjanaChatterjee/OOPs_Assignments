import java.util.*;
public class LeapYr
{
    
    public static void main(String args[])
    {
        int year=2024;
        if(year%100==0 && year%400==0)
        {
            System.out.println("Leap yr");
        }
        else if(year%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("not leap year");
        }
        
        
        
        
    }
}