//2022bcy0044
import java.util.*;
public class Stringq4
{
    public static void main( String args[] )
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {
                if(hm1.containsKey(s.charAt(i)))
                hm1.put(s.charAt(i),
                hm1.get(s.charAt(i))+1);
                else
                hm1.put(s.charAt(i), 1);
            }
        }
        int maxv = hm1.get(s.charAt(0));
        int minv = maxv;
        for (var x: hm1.values())
        {
            maxv = Math.max(maxv, x);
            minv = Math.min(x, minv);
        }
        for(var x:hm1.keySet())
        {
            if (hm1.get(x)==maxv || hm1.get(x)==minv)
            {
                System.out.print(x+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.print(' ');
                continue;
            }
            if (hm1.get(s.charAt(i))!=minv && hm1.get(s.charAt(i))!=maxv)
            {
                System.out.print(s.charAt(i));
            }
        }
        sc.close();
    }
}
