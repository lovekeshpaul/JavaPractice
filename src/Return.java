public class Return
{
    int length, width, height;
    long volume;
    
    long volume ()
    {
        volume = length*width*height;
        return volume;
    }
}
