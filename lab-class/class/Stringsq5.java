import java.util.*;
public class Stringsq5
{
    public static void main( String args[] )
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        while(st.hasMoreTokens())
        lhs.add(st.nextToken());
        for (String string : lhs)
        {
            System.out.print(string+" ");
        }
        sc.close();
    }
}