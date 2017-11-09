

public class MainThreadFirstDemo 
{
    public static void main(String args[]) 
    {
        Thread thread = Thread.currentThread();
        System.out.println("Current Thread: " +thread);
        try
        {
        Thread.sleep(1000);
        }
        catch(InterruptedException e)
                {
                    System.out.println("Thread Interrupted");
                }
        thread.setName("New Name");
        System.out.println("After Changing Name of the Thread: "+thread);
        
        try
        {
        Thread.sleep(1000);
        }
        catch(InterruptedException e)
                {
                    System.out.println("Thread Interrupted");
                }
        
        try
        {
            for(int i=5;i>=0;i--)
            {
            System.out.println("Number: "+i);
            Thread.sleep(2000);
            }
        }
        catch(Exception e)
                {
                    System.out.println("Thread Interrupted");
                }
    }
    
}
