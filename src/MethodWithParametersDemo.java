
import java.io.IOException;


public class MethodWithParametersDemo 
{
    public static void main(String args[]) throws IOException
    {
        MethodWithParameters demo1 = new MethodWithParameters();
        MethodWithParameters demo2 = new MethodWithParameters();
        
        demo1.volume(10, 20, 30);
        demo2.volume(40, 50, 10);
    }
    
}
