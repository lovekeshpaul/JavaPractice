package excetionhandling;

/**
 *
 * @author Lovekesh Paul
 */
public class ThrowClassExample
{
    public static void main (String args[])
    {
        try
        {
        throw new ArithmeticException("Division by zero");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        try
        {
           throw new NullPointerException(); 
        }
        catch(NullPointerException ex)
        {
            System.out.println(ex);
        }
        System.out.println("Test Complete.");
    }
}
