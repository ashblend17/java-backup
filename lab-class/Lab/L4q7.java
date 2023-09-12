import java.util.*;
public class L4q7
{
    static String decodeMessage(String s)
    {
        HashMap<String,Character> h1 = new HashMap<>();
        char curr = 'A';
        for (int i = 1; i <= 26; i++)
        {
            h1.put(Integer.toString(i), curr);
            curr = (char)(curr + 1);
        }
        h1.put("_", ' ');
        String res = "";
        String tmp = "";
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {
                tmp+=s.charAt(i);
            }
            else
            {
                arr.add(tmp);
                tmp = "";
            }
        }
        arr.add(tmp);
        int i = 0;
        while (i<arr.size())
        {
            if (arr.get(i).charAt(0)=='#')
            {
                i++;
                res+=arr.get(i);
            }
            else if(h1.containsKey(arr.get(i)))
                res+=h1.get(arr.get(i));
            else
                res+=arr.get(i);
            i++;
        }
            return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(decodeMessage(s1));
        sc.close();
    }
}