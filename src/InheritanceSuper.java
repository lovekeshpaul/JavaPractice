import java.io.IOException;

class Box2
{
    double length, width, height, volume;
    
Box2(Box2 obj)
{
    this.length = obj.length;
    this.width = obj.width;
    this.height = obj.height;
}

Box2(double length, double width, double height)
{
    this.length = length;
    this.width = width;
    this.height = height;
}

Box2()
{
    this.length = -1;
    this.width = -1;
    this.height = -1;
}

Box2(double length)
{
    this.length = this.width = this.height = length;
}

void volume()
{
    volume = length*width*height;
    System.out.println("Volume of Box is "+volume);
}
}

class BoxWeight2 extends Box2
{
    double weight;
    
BoxWeight2(BoxWeight2 obj1)
{
    super (obj1);
    this.weight = obj1.weight;
}

BoxWeight2(double length, double width, double height, double weight)
{
    super(length, width, height);
    this.weight = weight;
}

BoxWeight2(double length)
{
    super (length);
    this.weight = length;
}

BoxWeight2()
{
    super();
    this.weight = -1;
}

void weight()
{
    System.out.println("Weight of box is "+weight);
}
}


public class InheritanceSuper 
{
    public static void main (String args[]) throws IOException
    {
        BoxWeight2 mybox1 = new BoxWeight2(10,20,30,40);
        BoxWeight2 mybox2 = new BoxWeight2(20);
        BoxWeight2 mybox3 = new BoxWeight2(20,30,25,10);
        BoxWeight2 mybox4 = new BoxWeight2();
        BoxWeight2 myclone = new BoxWeight2(mybox1);
        
        mybox2.volume();
        mybox2.weight();
        
        mybox3.volume();
        mybox3.weight();
        
        mybox4.volume();
        mybox4.weight();
        
        myclone.volume();
        myclone.weight();
    }
}
