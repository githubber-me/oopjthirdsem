class MyThread extends Thread 
{
    MyThread() 
    {
        super("my extending thread");
        System.out.println("my thread created " + this);
        start();
    }
    public void run() 
    {
        try 
        {
            for (int i = 0; i < 10; i++) 
            {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
public class ExtendingExample 
{
    public static void main(String[] args) 
    {
        MyThread myThread = new MyThread();
        try 
        {
            while (myThread.isAlive()) 
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch (InterruptedException e) 
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over");
    }
}
