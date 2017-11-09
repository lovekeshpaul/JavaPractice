
import java.io.IOException;

class Box1
{
    double l,w,h,vol;
Box1( Box1 obj )
{
    this.l = obj.l;
    this.w =obj.w;
    this.h = obj.h;
}

Box1 (double l, double w, double h)
{
    this.l = l;
    this.w = w;
    this.h = h;
}

Box1 ()
{
    this.l = -1;
    this.w = -1;
    this.h = -1;
}

Box1 (double l)
{
    this.l = this.w = this.h = l;
}

void volume()
{   
    vol = l*w*h;
    System.out.println("Volume of box is "+vol);
}
}

class BoxWeight extends Box1
{
    double weight;
BoxWeight(double l, double w, double h,double weight)
{
    this.l = l;
    this.w = w;
    this.h = h;
    this.weight = weight;
}

void weight()
{
    
    System.out.println("Weight of box is "+weight+" Kilos");
}
}
public class InheritanceBox 
{
    public static void main (String args[]) throws IOException
    {
        BoxWeight boxobj1 = new BoxWeight(60,40,50,500);
        
        boxobj1.weight();
        boxobj1.volume();
        
    }
}
