
import java.io.IOException;
public class ReturnDemo 
{
    public static void main(String args[]) throws IOException
    {
        int length , width, height;
        
        Return return1 = new Return();
        Return return2 = new Return();
        
        return1.length = 10;
        return1.width = 20;
        return1.height = 30;
        
        return2.length = 40;
        return2.width = 30;
        return2.height = 10;
        
        System.out.println("Volume of First Box is "+return1.volume());
        System.out.println("Volume of Second Box is "+return2.volume());
    }
    
}
