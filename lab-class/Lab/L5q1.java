import java.util.*;
class circle2
{
    double radius;
    circle2(int n)
    {
        radius = n;
    }
    circle2()
    {
        radius = 5;
    }
    void display()
    {
        double pi = Math.PI;
        double a = pi * radius * radius;
        System.out.println("The area of circle is : " + a);
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        circle2 c3 = new circle2();
        c3.display();
        int x = input.nextInt();
        circle2 c1 = new circle2(x);
        c1.display();
        int y = input.nextInt();
        circle2 c2 = new circle2(y);
        c2.display();
        input.close();
    }
}