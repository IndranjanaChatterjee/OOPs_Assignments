import java.util.*;
public class StrImp
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(s.charAt(0));
        System.out.println(s.compareTo("Hello"));
        System.out.println(s.equals("HI"));
        System.out.println(s.substring(0,3));
        System.out.println(s.trim());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }

}