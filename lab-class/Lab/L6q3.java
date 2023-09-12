import java.util.ArrayList;
class Employee
{
private String name;
private int age;
private double salary;
public Employee(String name, int age, double salary)
{
this.name = name;
this.age = age;
this.salary = salary;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public int getAge()
{
return age;
}
public void setAge(int age)
{
this.age = age;
}
public double getSalary()
{
return salary;
}
public void setSalary(double salary)
{
this.salary = salary;
}
}
public class L6q3
{
public static void main(String[] args)
{
ArrayList<Employee> employees = new ArrayList<>();
Employee employee1 = new Employee("Name 1", 25,
5000);
Employee employee2 = new Employee("Name 2", 35,
6500);
employees.add(employee1);
employees.add(employee2);
for (Employee employee : employees)
{
System.out.println("Name: " +
employee.getName());
System.out.println("Age: " +
employee.getAge());
System.out.println("Salary: " +
employee.getSalary());
System.out.println();
}
employee1.setSalary(5500);
employee2.setAge(36);
for (Employee employee : employees)
{
System.out.println("Name: " +
employee.getName());
System.out.println("Age: " +
employee.getAge());
System.out.println("Salary: " +
employee.getSalary());
System.out.println();
}
}
}