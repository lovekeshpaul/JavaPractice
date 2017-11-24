public class TypesOfVariables 
{
    int a; //instance variable(automatically default value assigned)
    static int b; //static variable(automatically default value assigned)
    public static void main (String[] args)
    {
        int c=10; //local variable(need to assign a default value)
        TypesOfVariables tov = new TypesOfVariables();
        System.out.println(tov.a); //(cannot access intstance variables directly but only through reference)
        System.out.println(TypesOfVariables.b); //(static variables can be access directly by adressing class name)
        System.out.println(c); //(local variables can be accessed directly)
    }
}
