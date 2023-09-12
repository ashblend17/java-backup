import java.util.*;
public class L4q4 {
    public static void main(String Args[])
    {
        Scanner scan = new Scanner(System.in);
        int n, d;
        System.out.println("Enter the size of the array:");
        n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.println("Enter the value of \'d\'");
        d = scan.nextInt();
        shiftElements(array, d);
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        scan.close();
    }
    public static int[] shiftElements(int[] array, int d)
    {
        int[] arr = new int[array.length];
        int j = 0;
        for (int i = d; i < arr.length; i++)
        {
            arr[j] = array[i];
            j++;
        }
        for (int i = 0; i < d; i++)
        {
            arr[j] = array[i];
            j++;
        }
        for (int i = 0; i < array.length; i++)
        {
            array[i] = arr[i];
        }
        return array;
    }
}