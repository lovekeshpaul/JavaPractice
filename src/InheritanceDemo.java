
import java.io.IOException;

class A
{
    int i,j;
    
    void showij()
    {
        System.out.println("Values of i and j are " +i+" and "+j+" respectively.");
    }
}

class B extends A
{
    int k;
    
    void showk()
    {
        System.out.println("Value of k is "+k);
    }
    
    void sum()
    {
        int sum = i+j+k;
     System.out.println("Sum of i, j and k is "+sum);
    }
}

public class InheritanceDemo 
{
    public static void main (String args[]) throws IOException
    {
        A superobj = new A();
        B subobj = new B();
        
        superobj.i = 10;
        superobj.j = 20;
        
        subobj.i = 20;
        subobj.j = 20;
        subobj.k = 30;
        
        superobj.showij();
        subobj.showk();
        subobj.sum();
        
        System.out.println("Everything is going according to plan.");
    }    
}