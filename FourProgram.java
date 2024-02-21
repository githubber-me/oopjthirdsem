class MyPoint
{
    private int x;
    private int y;
    public MyPoint() 
    {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    public void setXY(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    public int[] getXY()
    {
        return new int[]{x, y};
    }
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    public double distance(int x, int y)
    {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    public double distance(MyPoint another)
    {
        return distance(another.x, another.y);
    }
    public double distance()
    {
        return distance(0, 0);
    }
}
public class TestMyPoint 
{
    public static void main(String[] args)
    {
        MyPoint point = new MyPoint();
        System.out.println(point);
        point.setXY(1, 1);
        System.out.println(point);
        System.out.println("Distance from origin: " + point.distance());
        MyPoint anotherPoint = new MyPoint(2, 2);
        System.out.println(anotherPoint);
        System.out.println("Distance from another point: " + point.distance(anotherPoint));
    }
}