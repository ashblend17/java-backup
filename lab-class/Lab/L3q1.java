import java.util.Scanner;
public class L3q1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int a [] = new int [12];
        for(int i=0;i<12;i++)
        {
            a[i] = in.nextInt();
        }
        int sum=0;
        for(int i=0;i<12;i++)
        {
            sum = sum + a[i];
        }
        int avg = sum/12;
        System.out.println("Average rain is "+avg);
        in.close();
    }
}