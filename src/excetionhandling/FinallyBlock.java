package excetionhandling;

/**
 *
 * @author Lovekesh Paul
 */
public class FinallyBlock 
{
    public static void main (String args[])
    {
        try
        {
            int i = 10/(10-10);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
        finally
        {
        System.out.println("Test Complete.");
        }
    }
}
