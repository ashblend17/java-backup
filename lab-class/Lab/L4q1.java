import java.util.*;
public class L4q1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [] a = new int [20];
        System.out.print("Enter the size of array :");
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }
        int sum,pro,count = 0;
        for(int i=0;i<n;i++)
        {
            sum =0;
            pro = 1;
            int num = a[i];
            while(num != 0 )
            {
                int k = num % 10;
                sum = sum + k;
                pro = pro * k;
                num = num/10;
            }
            if(pro != 0)
            {
                if(a[i] % sum == 0 || a[i] % pro == 0)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
        in.close();
    }
}
