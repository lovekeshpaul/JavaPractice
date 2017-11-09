import java.io.IOException;

class ObjAsPara
{
    int a,b;
    ObjAsPara(int i, int j)
    {
        a = i;
        b = j;
    }
    
    boolean equalTo (ObjAsPara obj)
    {
    if(obj.a==a&&obj.b==b)
    {   
      return true;
    }
    else return false;
    }
            
}


public class ObjectAsParameter 
{
    public static void main (String args[]) throws IOException
    {
     ObjAsPara obj1 = new ObjAsPara(100,200);
     ObjAsPara obj2 = new ObjAsPara(100,200);
     ObjAsPara obj3 = new ObjAsPara(102,200);
     
     System.out.println("Object 1 equals to Object 2 ;"+ obj1.equalTo(obj1));
     System.out.println("Object 1 equals to Object 2 ;"+ obj1.equalTo(obj2));
     System.out.println("Object 1 equals to Object 2 ;"+ obj1.equalTo(obj3));
     
    }
}
