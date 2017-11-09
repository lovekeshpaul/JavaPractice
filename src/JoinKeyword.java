class IsAlive implements Runnable
{
    String tname;
    Thread t;
    IsAlive(String name)
    {
        tname = name;
        t = new Thread (this,name);
        System.out.println("Thread "+name+" started");
        t.start();
    }
    
    public void run()
    {
        try
        {
            for(int i=5;i>=0;i--)
            {
                Thread.sleep(1000);
                System.out.println(tname+ ": "+i);
            }
        }
        
        catch(Exception e)
        {
        System.out.println("Thread "+tname+" interrupted");
        }
    }
}

public class JoinKeyword 
{
    public static void main(String args[])
    {
        IsAlive ia1 = new IsAlive("One");
        IsAlive ia2 = new IsAlive("Two");
        IsAlive ia3 = new IsAlive("Tnree");
        
        System.out.println("Thread One is Alive: " +ia1.t.isAlive());
        System.out.println("Thread Two is Alive: " +ia2.t.isAlive());
        System.out.println("Thread Three is Alive: " +ia3.t.isAlive());
        
        try
        {
        ia1.t.join();
        ia2.t.join();
        ia3.t.join();
        }
        catch(Exception e)
        {
        System.out.println("Something went Wrong!!!");
        }
    }
}
