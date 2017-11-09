
import java.io.IOException;

class reference
{
    int a,b;
    reference(int i, int j)
    {
        a=i;
        b=j;
    }
    void modify (reference obj)
    {
     a = 2*a;
     b = 2* b;
    
    }
}
public class CallByReference 

{
    public static void main (String args[]) throws IOException
    {
      
        reference ref = new reference(2,5);
        ref.modify(ref);
        System.out.println("Values after execution are "+ref.a+" "+ref.b);
    }
}
