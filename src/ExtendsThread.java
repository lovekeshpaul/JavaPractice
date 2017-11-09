class ThreadSecondDemo extends Thread
{
    Thread t;
  ThreadSecondDemo()
  {
      super("Child Thread");
      System.out.println("Child Thread Started: "+this);
      start();
  }
  
  public void run()
  {
    try
    {
     for (int i=5;i>=0;i--)
     {
      System.out.println("Tick Tick: "+i);
      Thread.sleep(1000);
     }
    }
  
    catch(Exception e)
    {
        System.out.println("Thread Interrupted");   
    }
    
    System.out.println("Exiting Child Thread");
  }
}

public class ExtendsThread 
{
    public static void main (String args[])
    {
         new ThreadSecondDemo();
         
         
        try
    {
     for (int i=5;i>=0;i--)
     {
      System.out.println("Main Thread: "+i);
      Thread.sleep(2000);
     }
    }
  
    catch(Exception e)
    {
        System.out.println("Thread Interrupted");   
    }
    
    System.out.println("Exiting Main Thread");
    }
    
}
