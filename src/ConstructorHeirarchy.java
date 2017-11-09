
import java.io.IOException;

class Aa
{
    int a;
    Aa(Aa obj)
    {
    a = obj.a;
    System.out.println("Object Constructor Aa is called");
    }
    Aa(int a)
    {
    this.a = a;
    System.out.println("Int Constructor Aa is called");
    }
}

class Bb extends Aa
{
    int b;
    
    Bb(Bb obj)
    {
     super(obj);
     b = obj.b;
     System.out.println("Object Constructor Bb is called");
    }
    Bb (int a, int b)
    {
    super(a);
    this.b = b;
    System.out.println("Int Constructor Bb is Called");
    }
    
    void display()
    {
            System.out.println("Value of A is "+ super.a);
            System.out.println("Value of B is "+ b);
}
}
class Cc extends Bb
{
    int c;
    
    Cc (Cc obj)
    {
        super(obj);
        c = obj.c;
        System.out.println("Object Constructor Cc is called");
    }
    Cc(int a, int b, int c)
    {
    super(a,b);
    this.c = c;
    System.out.println("Int constructor Cc is called");
    }
    
    void dislay()
    {
        super.display();
    System.out.println("Value of C is "+ c);
    }
}
public class ConstructorHeirarchy 
{
    public static void main(String args[]) throws IOException
    {
        Aa obja = new Aa(1);
        Bb objb = new Bb(1,2);
        Cc objc = new Cc(1,2,3);
        
        Cc objd = new Cc(objc);
        
        objc.dislay();
        objd.dislay();
    }
}
