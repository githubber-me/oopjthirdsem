abstract class Shape 
{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape 
{
    double radius;
    Circle(double radius) 
    {
        this.radius = radius;
    }
    double calculateArea() 
    {
        return Math.PI * Math.pow(radius, 2);
    }
    double calculatePerimeter() 
    {
        return 2 * Math.PI * radius;
    }
}
class Triangle extends Shape
{
    double base;
    double height;
    double side1;
    double side2;
    Triangle(double base, double height, double side1, double side2) 
    {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    double calculateArea() 
    {
        return 0.5 * base * height;
    }
    double calculatePerimeter() 
    {
        return base + side1 + side2;
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        Triangle triangle = new Triangle(5, 10, 5, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}