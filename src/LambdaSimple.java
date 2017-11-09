
import java.io.IOException;

interface Transaction 
{
void withdraw(int amt);
}



public class LambdaSimple 
{
 public static void main(String args[]) throws IOException
 {
    Transaction  obj = (int amt)->
    {
        System.out.println("Amount is :$"+amt+"/-");
    };
     
     obj.withdraw(25000);
             
 }
    
}
