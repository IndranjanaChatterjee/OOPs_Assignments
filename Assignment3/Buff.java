import java.io.*;
public class Buff
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int num=Integer.parseInt(in.readLine());
        System.out.println(num);
    }
    
}