import java.util.*;
public class MethodConOverloading
{
    double area;
    double pi=1;
    MethodConOverloading()
    {
        area=0.0;
    }
    MethodConOverloading(double p)
    {
        pi=p;
    }
    void shape(int a)
    {
        area=a*a;
        System.out.println((int)area);
    }
    void shape(double r)
    {
        area=pi*r*r;
        System.out.println(area);
    }
    public static void main(String args[])
    {
        MethodConOverloading ob=new MethodConOverloading();
        ob.shape(10);
        ob.shape(7.0);
        MethodConOverloading ob1=new MethodConOverloading(3.14);
        ob1.shape(5);
        double r=10.0;
        ob1.shape(r);
        
        
    }
    
}