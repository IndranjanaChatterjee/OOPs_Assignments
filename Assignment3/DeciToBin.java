import java.util.*;
public class DeciToBin
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int deci=in.nextInt();
        int i;
        double count;
        int bin=0,r,c=0;
        while(deci!=0)
        {
            r=deci%2;
            count=(int)(Math.pow(10,c));
            bin=bin+(r*(int)count);
            deci=deci/2;
            c++;
            
        }
        
        System.out.println("Binary :"+bin);
    }
    
}