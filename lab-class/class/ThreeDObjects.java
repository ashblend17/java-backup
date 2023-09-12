import java.util.*;
class ThreeDObjects
{
    double w;
    double l;
    double h;
     double r;
     double sarea;
     double vol;
    public  void wholeSurfaceArea()
    {

    }
    public  void volume()
    {

    }
}
class Box extends ThreeDObjects
{
    Box(double l,double w, double h)
    {
        super.l = l;
        super.w = w;
        super.h = h;
    }
    public void wholeSurfaceArea()
    {
        super.sarea=2*(l*w+w*h+h*l);
        System.out.println("Box="+super.sarea);
    }
    public void volume()
    {
        super.vol=l*w*h;
        System.out.println("Box="+super.vol);
    }
}
class Cube extends ThreeDObjects
{
    Cube(double l)
    {
        super.l = l;
    }
    public void wholeSurfaceArea()
    {
        super.sarea=6*l*l;
        System.out.println("Cube="+super.sarea);    
    }
    public void volume()
    {
        super.vol=l*l*l;
        System.out.println("Cube="+super.vol);
    }
}
class Cone extends ThreeDObjects
{
    Cone(double r,double h)
    {
        super.r = r;
        super.h = h;
    }
    public void wholeSurfaceArea()
    {
        super.sarea=3.14*r*(r+Math.sqrt(r*r+h*h));
        System.out.println("Cone="+super.sarea);
    }
    public void volume()
    {
        super.vol=3.14*r*r*h/3;
        System.out.println("Cone="+super.vol);
    }
}
class Cylinder extends ThreeDObjects
{
    Cylinder(double r,double h)
    {
        super.r = r;
        super.h = h;
    }
    public void wholeSurfaceArea()
    {
        super.sarea=2*3.14*r*(r+h);
        System.out.println("Cylinder="+super.sarea);
    }
    public void volume()
    {
        super.vol=3.14*r*r*h;
        System.out.println("Cylinder"+super.vol);
    }
}
class Main
{
    public static void main(String args[])
    {
        double w,l,h,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width, length, height and radius");
        w = sc.nextDouble();
        l = sc.nextDouble();
        h = sc.nextDouble();
        r = sc.nextDouble();
        Box box = new Box(l,w,h);
        Cube cube=new Cube(l);
        Cylinder cyl=new Cylinder(r,h);
        Cone cone=new Cone(r,h);
        System.out.println("Surface Area");
        box.wholeSurfaceArea();
        cube.wholeSurfaceArea();
        cone.wholeSurfaceArea();
        cyl.wholeSurfaceArea();
        System.out.println("Volume");
        box.volume();
        cube.volume();
        cone.volume();
        cyl.volume();
        cyl.volume(); 
    }
}