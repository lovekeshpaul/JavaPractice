package excetionhandling;
public class TryCatch 
{
    public static void main(String [] agrs) 
    {
        System.out.println("This example is programmed to test Try and Catch block.");
        try
        {
            throw new InterruptedException();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        System.out.println("Test Complete.");
    }
    
}
