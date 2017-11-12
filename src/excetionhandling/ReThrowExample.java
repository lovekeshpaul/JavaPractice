package excetionhandling;

/**
 *
 * @author Lovekesh Paul
 */
public class ReThrowExample 
{
    public static void main (String args []) throws ArithmeticException
    {
        String s = null;
        try
        {
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            throw new ArithmeticException();
        }
        System.out.println("Test Complete.");
    }
}
