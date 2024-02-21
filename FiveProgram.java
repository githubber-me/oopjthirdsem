abstract class Shape 
{
    abstract void draw();
    abstract void erase();
}

class Circle extends Shape 
{
    void draw() 
    {
        System.out.println("Drawing Circle");
    }
    void erase() 
    {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape 
{
    void draw() 
    {
        System.out.println("Drawing Triangle");
    }
    void erase() 
    {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape 
{
    void draw() 
    {
        System.out.println("Drawing Square");
    }
    void erase() 
    {
        System.out.println("Erasing Square");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Shape s;
        s = new Circle();
        // This line creates a new Circle object and assigns it to the ‘s’ variable of type Shape.
        This demonstrates polymorphism, where a more general type (Shape) can refer to a more
        specific type (Circle).
        s.draw();
        // Invokes the draw() method on the s object.
        s.erase();
        s = new Triangle();
        s.draw();
        s.erase();
        s = new Square();
        s.draw();
        s.erase();
    }
}