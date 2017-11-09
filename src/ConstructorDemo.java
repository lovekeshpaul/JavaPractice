public class ConstructorDemo
{
  public static void main (String args[])   
  {
      Constructor constructor1 = new Constructor(10,20,30);
      Constructor constructor2 = new Constructor(70,10,10);
      
      System.out.println("Volume of First Box is "+constructor1.volume());
      System.out.println("Volume of Second Box is "+constructor2.volume());
  }
}
