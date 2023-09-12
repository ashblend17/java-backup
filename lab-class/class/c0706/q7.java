import java.util.*; 
abstract class Marks
{ 
 abstract void getPercentage(); 
} 
class A extends Marks{ 
 int mark1,mark2,mark3; 
 A(int mark1,int mark2,int mark3) 
 { 
 this.mark1=mark1; 
 this.mark2=mark2; 
 this.mark3=mark3; 
 } 
 void getPercentage() 
 { 
 System.out.println("Percentage :"+(float)(mark1+mark2+mark3)/3); 
 } 
} 
class B extends Marks{ 
 int mark1,mark2,mark3,mark4; 
 B(int mark1,int mark2,int mark3,int mark4) 
 { 
 this.mark1=mark1; 
 this.mark2=mark2; 
 this.mark3=mark3; 
 this.mark4=mark4; 
 } 
 void getPercentage() 
 { 
 System.out.println("Percentage :"+(float)(mark1+mark2+mark3+mark4)/4); 
 } 
} 
public class q7 { 
 public static void main(String[] args) { 
 Scanner obj=new Scanner(System.in); 
 System.out.print("Enter the marks of three subjects of student A:"); 
 int m1,m2,m3,m4; 
 m1=obj.nextInt(); 
 m2=obj.nextInt(); 
 m3=obj.nextInt(); 
 A a=new A(m1,m2,m3);
 a.getPercentage(); 
 System.out.print("Enter the marks of four subjects of student B:"); 
 m1=obj.nextInt(); 
 m2=obj.nextInt(); 
 m3=obj.nextInt(); 
 m4=obj.nextInt(); 
 B b=new B(m1,m2,m3,m4); 
 b.getPercentage(); 
 } 
} 