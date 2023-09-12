import java.util.Scanner;
public class L4q5
{
    public static int gcd(int a, int b)
    {
        if (a == 0)
        {
            return b;
        }
        else
        {
            return gcd(b % a, a);
        }
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arrayLength; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] lcmArr = new int[arrayLength - 1];
        for (int i = 0; i < arrayLength - 1; i++)
        {
            lcmArr[i] = lcm(arr[i], arr[i+1]);
        }
        int max = lcmArr[0];
        for (int i = 1; i < arrayLength - 1; i++)
        {
            if (lcmArr[i] > max)
            {
                max = lcmArr[i];
            }
        }
        System.out.println("The largest element in set S is " + max);
        sc.close();
    }
}