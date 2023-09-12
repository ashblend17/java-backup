import java.util.*;
public class L5q8 {
int a,b,c;
L5q8(int x,int y,int z){
a = x;
b = y;
c = z;
}
double getDiscriminent()
{
double d = (b*b)-4*a*c;
return d;
}
double root1(){
double r1 = (-b + Math.sqrt((b*b) - 4*a*c))/2*a;
return r1;
}
double root2(){
double r2 = (-b - Math.sqrt((b*b) - 4*a*c))/2*a;
return r2;
}
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int x = input.nextInt();
int y = input.nextInt();
int z = input.nextInt();
L5q8 k = new L5q8(x,y,z);
if( k.getDiscriminent() >= 0 ){
System.out.println("The first root is : "+k.root1());
System.out.println("The second root is : "+k.root2());
}
else
{
System.out.println("Roots are not real");
}
}
}