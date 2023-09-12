import java.util.Scanner;

class AgeNotWithinRangeException extends Exception
{
    private int age;
    public AgeNotWithinRangeException(int age) 
    {
        super();
        this.age = age;
    }

    public String getMessage() 
    {
        return "Age " + age + " is not within the range of 15 to 21.";
    }
}

class NameNotValidException extends Exception
{
    private String name;

    public NameNotValidException(String name) 
    {
        super();
        this.name = name;
    }
    public String getMessage() 
    {
        return "Name '" + name + "' is not valid. It contains numbers or special symbols.";
    }
}

class Student 
{

    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException 
    {
        this.rollNo = rollNo;

        if (age < 15 || age > 21) 
        {
            throw new AgeNotWithinRangeException(age);
        }
        this.age = age;

        if (!name.matches("[a-zA-Z]+")) 
        {
            throw new NameNotValidException(name);
        }
        this.name = name;

        this.course = course;
    }
}

public class L10q4 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter course: ");
        String course = scanner.next();

        scanner.close();

        try 
        {
            Student student = new Student(rollNo, name, age, course);
            System.out.println("Student created successfully.");
        } 
        catch (AgeNotWithinRangeException e)
        {
            System.out.println("Error creating student: " + e.getMessage());
        } 
        catch (NameNotValidException ee)
        {
            System.out.println("Error creating student:"+ee.g)
        }
    }
}