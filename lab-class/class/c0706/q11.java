import java.util.*; 
abstract class Shape
{ 
 abstract void RectangleArea(float l,float b); 
 abstract void SquareArea(float s); 
 abstract void CircleArea(float r); 
} 
class area extends Shape
{ 
 void RectangleArea(float l,float b) 
 { 
 System.out.println("Rectangle area is :"+(l*b)); 
 } 
 void SquareArea(float s) 
 { 
 System.out.println("Square area is :"+(s*s)); 
 } 
 void CircleArea(float r) 
 { 
 System.out.println("Circle area is :"+(3.14*r*r)); 
 } 
} 
public class q11 { 
 public static void main(String[] args) { 
 Scanner obj=new Scanner(System.in); 
 area a[]=new area[4]; 
 area ba=new area(); 
 for(int i=0;i<4;i++) 
 a[i]=ba; 
 for(int i=0;i<4;i++){ 
     System.out.print("Enter length and breadth of rectangle "+(i+1)+" :"); 
     float l=obj.nextFloat(); 
     float b=obj.nextFloat(); 
     System.out.print("Enter the length of side of square "+(i+1)+" :"); 
     float s=obj.nextFloat(); 
     System.out.print("Enter the radius of Circle "+(i+1)+" :"); 
     float r=obj.nextFloat(); 
     a[i].RectangleArea(l, b); 
     a[i].SquareArea(s); 
     a[i].CircleArea(r);} 
System.out.print("Enter the radius of Circle 5 :"); 
 float r=obj.nextFloat(); 
 a[0].CircleArea(r); 
 } 
}
