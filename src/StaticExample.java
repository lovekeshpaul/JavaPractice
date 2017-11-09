
import java.io.IOException;

class StaticExample
{
static int a,b,c;
 
 static void meth ()
 { a = 7;
    b = 8;
 System.out.println("This will execute afterwards.");
 System.out.println(a+" "+b);
 }
 
 static void display()
 {
  System.out.println("this will execute first.");
 }
 
 public static void main(String args[]) throws IOException
        {
//         StaticDemo sd = new StaticDemo();
//         sd.meth();
            meth();
           
        }
}
