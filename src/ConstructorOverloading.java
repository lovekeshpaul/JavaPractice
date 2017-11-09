
   class Box
   { 
       int length, width, height;
    Box()
    {
        length = -1;
        width = -1;
        height = -1;
    }
    Box(int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }
    Box(int l)
    {
        length = width = height = l;
    }
    void volume ()
    {
    int volume = length*width*height;
    System.out.println("Volume of Box is "+volume);
    }
   }
  
   public class ConstructorOverloading 
{
   public static void main(String args[])
       {
       Box box1 = new Box();
       Box box2 = new Box(100,20,1);
       Box box3 = new Box(25);
       
       box1.volume();
       box2.volume();
       box3.volume();
       }
   }