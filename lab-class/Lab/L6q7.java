    import java.util.*;
    public class L6q7 {
    public static void main(String[] args) {
    Circle c = new Circle();
    c.setRadius(13.46);
    double res = c.getArea();
    System.out.println("The area is "+res);
    }
    }
    class Circle{
    private final double PI = Math.PI;
    private double radius;
    Circle(){
    radius = 0;
    }
    double getRadius()
    {
    return radius;
    }
    void setRadius(double r)
    {
    radius = r;
    }
    double getArea()
    {
    return PI*radius*radius;
    }
    }