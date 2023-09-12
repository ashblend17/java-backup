//2022BCY0044
import java.util.Scanner;
public class L3q2
{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        System.out.println("The table is");
        for(int j=1;j<=a;j++)
        {
            for(int i=1;i<=a;i++)
            {
                System.out.print(Math.pow(j,i)+"\t\t");
            }
            System.out.println();
        }
        in.close();
    }
}