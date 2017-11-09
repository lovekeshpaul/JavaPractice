class AA
{
    synchronized void call (String msg)
    {
      System.out.print("["+msg);
    
    try
    {
     Thread.sleep(1000);
     System.out.println("]");
    }
    catch(Exception e)
    {
        System.out.println("System Interrupted");
    }
    }
}
class SynchronizedMethod implements Runnable
{
    AA a;
    Thread t;
    String msg;
    SynchronizedMethod (AA a,String msg)
    {
        this.a = a;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }
 public void run()
 {
     a.call(msg);
 }
}        
public class SynchronizationPractice 
{
    public static void main (String args[])
    {
        AA aa = new AA();
        SynchronizedMethod sm1 = new SynchronizedMethod(aa,"Hello");
        SynchronizedMethod sm2 = new SynchronizedMethod(aa,"Synchronised");
        SynchronizedMethod sm3 = new SynchronizedMethod(aa,"Method");
    }
}
