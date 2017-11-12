package excetionhandling;

/**
 *
 * @author Lovekesh Paul
 */
public class TopExceptions 
{
    public static void main (String args[])
    {
        try
        {
            String s="";
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        try
        {
            int a[]=new int[4];
            a[4]= 10;
        }
        catch(IndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        try
        {
            int i = Integer.parseInt("ten");
        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
        }
        try
        {
            Thread t = new Thread();
            t.setPriority(15);
        }
        catch(IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        try
        {
            Thread t = new Thread();
            t.start();
            t.start();
        }
        catch(IllegalStateException e)
        {
            e.printStackTrace();
        }
        System.out.println("Test Complete.");
    }
}
