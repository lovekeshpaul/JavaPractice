class Random
{
    int n;
    boolean valid = false;
    
    synchronized public void get()
    {
        if(!valid)
        {
        try
        {
            wait();
        }
        
        catch (Exception e)
        {
            System.out.println("Something went wrong.");
        }
        }
        else
                {
                    try
                    {
                    System.out.println("Get: "+n);
                    valid = false;
                    notify();
                    Thread.sleep(2000);
                    }
                    catch (Exception e)
                    {
                        System.out.println("Something went wrong.");
                    }
                }
    }
    
    synchronized public void put(int n)
    {
        if(valid)
        {
        try
        {
            wait();
        }
        
        catch (Exception e)
        {
            System.out.println("Something went wrong.");
        }
        }
        else
        {
            try
            {
            System.out.println("Put: "+n);
            this.n = n;
            valid = true;
            notify();
            Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println("Something went wrong.");
            }
        }
    }
}

class Reader implements Runnable
{
    Thread t1;
    Random r;
    
    Reader (Random r)
    {
        this.r = r;
        t1 = new Thread(this,"Reader");
        t1.start();
    }
    
    public void run()
    {
        while(true)
        {
        r.get();
        }
    }
}

class Writer implements Runnable
{
    Thread t2;
    Random r;
    int i =0;
    
    Writer(Random r)
    {
        this.r = r;
        t2 = new Thread (this, "Writer");
        t2.start();
    }
    
    public void run()
    { 
        while(true)
        {
        r.put(i++);
        }
    }
}

public class WaitNotify 
{
    public static void main(String args[])
    {
        Random r = new Random();
        new Writer(r);
        new Reader(r);
    }
}
