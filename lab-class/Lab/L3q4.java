//2022BCY0044
import java.util.Scanner;
public class L3q4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the time :");
        double t = in.nextDouble();
        double time = t/60;
        System.out.print("Enter the distance :");
        double d = in.nextDouble();
        double speed = d/(time*1.6);
        System.out.print("The speed of runner is :"+speed);
        in.close();
    }
}