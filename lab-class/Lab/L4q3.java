import java.util.*;
public class L4q3
{
    static void firstNonRepeat(String str,int n)
    {
        char [] a = new char [n];
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i] = str.charAt(i);
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i] == a[j])
                {
                    break;
                }
                if( j == n-1 && a[i] != a[j])
                {
                    System.out.println(a[i]);
                    return;
                }
            }
        }
        System.out.println("0");
        return;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = str.length();
        firstNonRepeat(str,n);
        in.close();
    }
}