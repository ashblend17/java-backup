//2022bcy0044
import java.util.Scanner;
public class L3q5
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("First add some characters...");
        char[] a = s.nextLine().toCharArray();
        int count=0;
        for(int i=0; i < a.length;i++)
        {
            if(a[i] == 'a' || a[i] == 'A' || a[i] == 'e' || a[i] == 'E' || a[i] == 'i' || a[i] =='I' || a[i] == 'o' || a[i] == 'O' || a[i] == 'u' || a[i] =='U')
            {
                count++;
            }
        }
        System.out.println("No. of vowels:"+count);
        int k = a.length-count;
        System.out.println("No. of consonants :"+ k);
        s.close();
    }
}