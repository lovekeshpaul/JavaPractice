import java.io.IOException;

class Stack
{
    int a = 0;
    int stack[] = new int[10];
 Stack()
 {
     
 }
    void push( int i)
    {
      
       if (a<10)
       {
           stack[a]=i;
           a++;
           push(i++);
       }
       else
       {
           a--;
       }
    }
    
    
    void pop()
    {
        if(a>=0)
        {
            System.out.println(stack[a]);
            a--;
            pop();
        }
        
    }
}

public class StackRecursion
{
    public static void main (String args[]) throws IOException
    {
        Stack Stack1 = new Stack();
        
        Stack1.push(1);
        Stack1.pop();
    }
    
}
