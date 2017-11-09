
import java.io.IOException;

public class MethodDemo 
{
    public static void main (String args[])throws IOException
    {
        Method method1 = new Method();
        Method method2 = new Method();
        
        method1.length = 10;
        method1.width = 20;
        method1.height = 30;
        
        method2.length = 40;
        method2.width = 50;
        method2.height = 60;
        
        method1.volume();
        method2.volume();
    }
}
