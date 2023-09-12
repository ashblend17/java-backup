abstract class Shape
{
    abstract void rectangleArea(int l, int b);
    abstract void squareArea(int s);
    abstract void circleArea(double r);
}
class area extends Shape
{
    int length, breadth, side,radius;
    void rectangleArea(int l, int b){
        System.out.println("Area of rectangle is: "+l*b);
    } 
    void squareArea(int s){
        System.out.println("Area of square is: "+s*s);
    }
    void circleArea(double r){
        System.out.println("Area of circle is: "+3.14*r*r);
    }  
}
public class q10
{
    public static void main(String[] args) {
        area a=new area();
        a.rectangleArea(9,8);
        a.squareArea(9);
        a.circleArea(9);
    }
}
