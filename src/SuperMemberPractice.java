
import java.io.IOException;
class SuperClass 
{
    int i;
}    
    class Subclass extends SuperClass
    {
        int i;
        
        Subclass(int a, int b)
        {
            super.i = a;
            i = b;
        }
    
        void display()
        {
        System.out.println("Value of Super Class Variable is "+ super.i);
        System.out.println("Value of Sub Class Variable is "+ i);
        }
    }

public class SuperMemberPractice
{
    public static void main(String args[]) throws IOException
    {
        Subclass sc = new Subclass (5,6);
        sc.display();
    }
}