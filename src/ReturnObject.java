import java.io.IOException;

class Demo
{
    int a,b;
    
    Demo(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    
    Demo increase (Demo obj)
    {
        a= a+1;
        b= b+1;
        return obj;
    }
    
}
        
public class ReturnObject
{
    public static void main (String args[]) throws IOException
    {
        Demo obj1 = new Demo(2,5);
        System.out.println("Old Value were "+obj1.a+" and "+obj1.b);
        
        Demo obj2 = obj1.increase(obj1);
        System.out.println("New Values are "+obj2.a+" and "+obj2.b);
    }    
}
