import java.util.*;
public class L5q3
{
int w;
int h;
L5q3() 
{
w = 1;
h = 1;
}
L5q3(int x,int y)
{
h = x;
w = y;
}
void length_width(L5q3 r1){
System.out.println("Length of L5q3 is : "+h+" and Width of the L5q3 is :"+w);
}
double perimeter(L5q3 r1){
int c = r1.w;
int d = r1.h;
int peri = 2*(c+d);
return peri;
}
double area(L5q3 r1){
int c = r1.w;
int d = r1.h;
int area = c*d;
return area;
}
public static void main(String[] args){
Scanner input = new Scanner(System.in);
L5q3 r1 = new L5q3();
System.out.println("The default length and width are : "+r1.h+r1.w);
L5q3 r2 = new L5q3(40,4);
r2.length_width(r2);
System.out.println("The perimeter of L5q3 : "+r2.perimeter(r2));
System.out.println("The area of L5q3 :"+r2.area(r2));
L5q3 r3 = new L5q3(35,3);
r2.length_width(r2);
System.out.println("The perimeter of L5q3 : "+r2.perimeter(r2));
System.out.println("The area of L5q3 :"+r2.area(r2));
input.close();
}
}