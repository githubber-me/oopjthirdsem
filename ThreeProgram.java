public class Employee 
{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }
    public double getSalary() 
    {
        return salary;
    }
    public void raiseSalary(double percent) 
    {
        salary += salary * percent / 100.0;
    }
    public String toString() 
    {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    public static void main(String[] args) 
    {
        Employee emp = new Employee(1, "Manisha Mehta", 50000.0);
        System.out.println("Before raise:");
        System.out.println(emp);
        emp.raiseSalary(10);
        System.out.println("After 10% raise:");
        System.out.println(emp);
    }
}