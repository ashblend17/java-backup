import java.util.*;

public class Exc
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in))
        {
            int a[] = new int[100];
            int i = 0;
            for (i = 0; i < 100; i++) {
                a[i] = (int)((Math.random()+1)*100000);
            }
            try {
                i = sc.nextInt();
                System.out.println(a[i]);
            } catch (Exception e) {
                System.out.println("Select input from 1 to 100");
            }
            sc.close();
        }
    }

}