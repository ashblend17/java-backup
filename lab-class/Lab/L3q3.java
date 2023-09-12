//2022BCY0044
import java.util.Scanner;
public class L3q3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        double r = in.nextInt();
        double a=3.14*r*r;
        System.out.println("The area is :"+a);
        double p=3.14*r*2;
        System.out.println("The perimeter is :"+p);
        in.close();
    }
}