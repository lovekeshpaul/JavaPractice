import java.io.IOException;

class factorial
{
    int a;
    
    int calculate(int i)
    {
         
        if(i==1)
        {
           
            return 1;
        }
        else
        {
          
            a = calculate(i-1)*i;    
            return a;
        }
    
    }
}

public class Recursion
{
    public static void main (String args[])throws IOException
    {
     factorial obj1 = new factorial();
     obj1.calculate(5);
     System.out.println("Factorial of the number is :"+obj1.a);
    }
    
}
