import java.util.*;
public class L4q2
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        char[] str = new char[100];
        String s = in.nextLine();
        int n = s.length();
        for (int i = 0; i < n; i++) {
        str[i] = s.charAt(i);
        }
        System.out.println(checkPassword(str, n));
        in.close();
    }
    static int checkPassword(char a[], int n)
    {
        int num = 0;
        int a1= 0;
        int A2 = 0;
        int sp = 0;
        if (n >= 4) {
            for (int i = 0; i < n; i++)
            {
                if (a[i] >= '0' && a[i] <= '9')
                {
                    num++;
                }
                else if ((a[i] >= 'a' && a[i] <= 'z'))
                {
                    a1++;
                }
                else if((a[i] >= 'A' && a[i] <= 'Z'))
                {
                    A2++;
                }
                else if (a[i] != ' ' && a[i] != '/') 
                {
                    sp++;
                }
            }
            int last = 1;
            if (a[0] >= 0 && a[0] <= 9)
            last = 0;
            if (num != 0 && a1 != 0 && A2 != 0 && sp != 0 && last != 0)
            return 1;
        }
        return 0;
    }
}