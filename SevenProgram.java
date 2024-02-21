interface Resizable 
{
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable 
{
    int width;
    int height;
    Rectangle(int width, int height) 
    {
        this.width = width;
        this.height = height;
    }
    public void resizeWidth(int width) 
    {
        this.width = width;
        System.out.println("Rectangle width resized to: " + width);
    }
    public void resizeHeight(int height) 
    {
        this.height = height;
        System.out.println("Rectangle height resized to: " + height);
    }
    public static void main(String[] args) 
    {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(25);
    }
}