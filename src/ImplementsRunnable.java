
class Target implements Runnable
{
    Thread t;
    Target()
    {
      t = new Thread (this,"Child Thread"); /*this represents that you want the new thread to call run method on THIS object */
      System.out.println("Child Thread Started: "+t);
      t.start();
    }
    public void run()
    {
     try
     {
     for(int i=5;i>=0;i--)
     {
         System.out.println("Tick Tick "+i);
         Thread.sleep(1000);
     }
     }
     catch ( Exception e)
     {
     System.out.println("Child Thread Interrupted");
     }
    }
}

public class ImplementsRunnable 
{
    public static void main (String args[])
    {
        new Target();
        
        System.out.println("Main Thread Initialized");
        try
        {
            for(int i=5;i>=0;i--)
            {
                System.out.println("Main Thread: "+i);
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
                {
                    System.out.println("Main Thread Interrupted");
                }
    }
    
}
