//2022bcy0044
import java.util.*;
public class stringq1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st= new StringTokenizer(s);
        System.out.println(st.countTokens());
        while (st.hasMoreTokens())
        {
            System.out.print(st.nextToken().length()+" ");
        }
        sc.close();
    }
}