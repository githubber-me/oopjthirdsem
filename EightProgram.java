public class OuterClass 
{
    void display() 
    {
        System.out.println("This is the display method of the outer class.");
    }
    class InnerClass 
    {
        void display() 
        {
            System.out.println("This is the display method of the inner class.");
        }
    }
    public static void main(String[] args) 
    {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        outer.display();
        inner.display();
    }
}