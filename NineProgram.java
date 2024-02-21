class DivisionByZeroException extends Exception 
{
    DivisionByZeroException(String message)
    {
        super(message);
    }
}
public class Main 
{
    static void divide(int a, int b) throws DivisionByZeroException 
    {
        if (b == 0) 
        {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        else 
        {
            System.out.println("The result is " + (a / b));
        }
    }
    public static void main(String[] args) 
    {
        try 
        {
            divide(10, 0);
        } 
        catch (DivisionByZeroException e) 
        {
            System.out.println("Caught exception: " + e.getMessage());
        } 
        finally
        {
            System.out.println("End of program.");
        }
    }
}