
import java.io.IOException;

class PrivateDemo
{
 int a;
 public int b;
 private int c;
 
// PrivateDemo(int a, int b, int c)
// {
//     this.a=a;
//     this.b=b;
//     this.c=c;
// }
 
 void setc(int i)
 {
     c=i;
 }
 
 void display()
 {
  System.out.println("Integer A: "+a);
  System.out.println("Integer B: "+b);
  System.out.println("Integer C: "+c);
 }
}
public class PrivateKeyword
{
    public static void main (String args[]) throws IOException
    
    {
        PrivateDemo pd = new PrivateDemo();
        pd.a= 5;
        pd.b= 9;
        pd.setc(3);
        pd.display();
    }
    
}
