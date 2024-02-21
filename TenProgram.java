// MyClass.java
package mypack;
public class MyClass 
{
    public void display() 
    {
        System.out.println("This is MyClass of mypack.");
    }
}
// Then your workspace (not inside mypack), create a file named Main.java with the
// following code:
// Main.java
import mypack.MyClass;
public class Main {
public static void main(String[] args) {
MyClass obj = new MyClass();
obj.display();
}
}