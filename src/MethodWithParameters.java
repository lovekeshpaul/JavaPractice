public class MethodWithParameters 
{
    int length, width, height;
    int volume;
    
    void volume (int l, int w, int h)
    {
     this.length = l;
     this.width = w;
     this.height = h;
     
     volume = length*width*height;
     System.out.println("Volume of Box is "+ volume);
    }

}
