public class Stack 
{
    private int maxSize;
    private int top;
    private int[] stackArray;
    public Stack(int size) 
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) 
    {
        if (top < maxSize - 1) 
        {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to the stack");
        }
        else 
        {
            System.out.println("Stack is full. Can't push " + value);
        }
    }
    public void pop() 
    {
        if (top >= 0) 
        {
            System.out.println("Popped " + stackArray[top--] + " from the stack");
        } 
        else 
        {
            System.out.println("Stack is empty. Can't pop");
        }
    }
    public static void main(String[] args) 
    {
        Stack stack = new Stack(10);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.pop();
        stack.pop();
        stack.pop();
    }
}