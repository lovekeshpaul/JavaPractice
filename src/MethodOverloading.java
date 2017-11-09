

class Test
{
  void printby()
  {
      System.out.println("Method with no parameters is called.");
  }
  void printby(int i)
  {
   System.out.println("Method with integer value is called.");
  }
  void printby(boolean a)
  {
   System.out.println("Method with Boolean Value is called.");
  }
}
        
public class MethodOverloading 
{
    public static void main(String args[]) 
    {
       Test box = new Test();
       box.printby();
       box.printby(5);
       box.printby(false);
    }
    
    
}
