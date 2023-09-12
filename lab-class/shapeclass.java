import java.util.*;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getVolume();

    // public String toString() {
    // return "Name of the shape: " + name;
    // }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getVolume() {
        return 0.0; // Not applicable for 2D shapes
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getVolume() {
        return 0.0; // Not applicable for 2D shapes
    }
}

class Cuboid extends Shape {
    double length;
    double breadth;
    double height;

    public Cuboid(double length, double breadth, double height) {
        super("Cuboid");
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double getArea() {
        return 2 * ((length * breadth) + (breadth * height) + (height * length));
    }

    public double getVolume() {
        return length * breadth * height;
    }
}

public class shapeclass {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Name of the shape:");
        String s = src.next();
        // char[] a = new char[10];
        // a[0] = s.charAt(0);

        if (s.equals("Rectangle")) {
            System.out.print("Length:");
            double l = src.nextDouble();
            System.out.print("Breadth:");
            double b = src.nextDouble();
            System.out.print("Radius:");
            double h = src.nextDouble();
            Rectangle r = new Rectangle(l, b);
            System.out.println("Name of the shape:" + r.name);
            System.out.println("Length:" + r.length);
            System.out.println("Breadth:" + r.breadth);
            System.out.println("Radius:" + 0);
            System.out.println("Area:" + r.getArea());
        }

        if (s.equals("Circle")) {
            System.out.print("Length:");
            double l = src.nextDouble();
            System.out.print("Breadth:");
            double b = src.nextDouble();
            System.out.print("Radius:");
            double h = src.nextDouble();

            Circle r = new Circle(h);
            System.out.println("Name of the shape: " + r.name);
            System.out.println("Length: " + 0);
            System.out.println("Breadth : " + 0);
            System.out.println("Radius: " + r.radius);
            System.out.println("Area" + r.getArea());
        }

        if (s.equals("Cuboid")) {
            System.out.print("Length:");
            double l = src.nextDouble();
            System.out.print("Breadth:");
            double b = src.nextDouble();
            System.out.print("Radius:");
            double h = src.nextDouble();
            System.out.print("Height:");
            double d = src.nextDouble();

            Cuboid r = new Cuboid(l, b, d);
            System.out.println("Name of the shape:" + r.name);
            System.out.println("Length:" + r.length);
            System.out.println("Breadth:" + r.breadth);
            System.out.println("Radius:" + 0);
            System.out.println("Height:" + r.height);
            System.out.println("Area:" + r.getArea());
        }
    }
}