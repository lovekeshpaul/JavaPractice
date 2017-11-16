package arrays;

/**
 *
 * @author Lovekesh Paul
 */
public class ArraysCreation 
{
    public static void main (String[] args)
    {
        int[] x = new int [10];
        System.out.println(x.getClass().getName());
        int[][] y = new int[10][10];
        System.out.println(y.getClass().getName());
        String[] z = new String [20];
        System.out.println(z.getClass().getName());
        String [][] z2 = new String[10][5];
         System.out.println(z2.getClass().getName());
    }
    
}
