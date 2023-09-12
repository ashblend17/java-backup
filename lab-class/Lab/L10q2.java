import java.util.*;
class Triangle
{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException
    {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)
        {
            throw new IllegalTriangleException("The sum of any two sides must be greater than the third side");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1()
    {
        return side1;
    }
    public double getSide2()
    {
        return side2;
    }
    public double getSide3()
    {
        return side3;
    }
}

class IllegalTriangleException extends Exception
{

    public IllegalTriangleException(String message)
    {
        super(message);
    }

}

public class L10q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1:");
        double side1 = sc.nextDouble();
        System.out.println("Enter Side 2:");
        double side2 = sc.nextDouble();
        System.out.println("Enter side 3:");
        double side3 = sc.nextDouble();
        try
        {
            Triangle tri = new Triangle(side1, side2, side3);
            System.out.println("Valid Triangle");
        } catch (IllegalTriangleException e)
        {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}