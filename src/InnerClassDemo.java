
import java.io.IOException;


class OuterClass
{
 int outer_x = 10;
class InnerClass 
{ 
  int inner_y = 20;
  void displayx()
  {
      System.out.println("X is :" +outer_x);
  }
}
void displayy()
{ 
    InnerClass ic = new InnerClass();
    System.out.println("Y is :"+ ic.inner_y);
}
}

public class InnerClassDemo
{
    public static void main(String args[]) throws IOException
    {
     OuterClass oc = new OuterClass();
     oc.displayy();
     System.out.println("X is :"+oc.outer_x);
    }
}
