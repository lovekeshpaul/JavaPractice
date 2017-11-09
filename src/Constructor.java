public class Constructor 

{
    int length,width,height;
    Constructor(int length, int width, int height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    int volume ()
    {
        int volume = length*width*height;
        return volume;
    }
    
    
}
