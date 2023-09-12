//2022bcy0044
import java.util.Scanner;
public class L3q6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        int sum = 0;
        int i=0;
        for(int j=1 ; j<=10000 ; j++)
        {
            sum=0;
            for(i=1;i<j;i++)
            {
                if(j%i == 0)
                {
                    sum=sum+i;
                }
            }
            if(sum == j)
            {
                System.out.print(j+" ");
            }
        }
        in.close();
    }
}